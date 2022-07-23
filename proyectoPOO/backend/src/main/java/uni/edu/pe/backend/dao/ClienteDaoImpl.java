package uni.edu.pe.backend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.backend.model.Cliente;
import uni.edu.pe.backend.model.ClienteRegister;
import uni.edu.pe.backend.model.ClienteRespuesta;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ClienteDaoImpl implements ClienteDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection connection;

    private void getConnection() {
        try{
            connection = jdbcTemplate.getDataSource().getConnection();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        try{
            connection.close();
            connection = null;
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cliente> obtenerCliente() {
        List<Cliente> lista = new ArrayList<>();
        String sql = " SELECT cl.id_cliente, cl.nombres, cl.apellidos, cl.direccion, cl.telefono, cl.correo, cl.contrasena FROM cliente cl;";
        try {
            getConnection();
            Statement sentencia = connection.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                lista.add(extraerCliente(resultado));
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    private Cliente extraerCliente(ResultSet resultado) throws SQLException {
        Cliente cliente = new Cliente(
                resultado.getString("id_cliente"),
                resultado.getString("nombres"),
                resultado.getString("apellidos"),
                resultado.getString("direccion"),
                resultado.getString("telefono"),
                resultado.getString("correo"),
                resultado.getString("contrasena")
        );
        return cliente;
    }

    @Override
    public Cliente obtenerClientePerfil(Cliente cliente) {
        getConnection();
        try {
            String sql = " SELECT cl.id_cliente, cl.nombres, cl.apellidos, cl.direccion, cl.telefono, \n" +
                    "ct.correo, ct.contrasena FROM cliente cl\n" +
                    "INNER JOIN cuenta ct ON (cl.id_cliente = ct.id_cliente) where cl.id_cliente = ?;";
            PreparedStatement sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, cliente.getId_cliente());
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                cliente = extraerCliente(resultado);
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    @Override
    public ClienteRespuesta registerByEmail(Cliente cliente) {
        ClienteRespuesta clienteRespuesta = new ClienteRespuesta();
        getConnection();
        try {
            String sql = "INSERT INTO cliente VALUES (NEXTVAL(id_cliente), ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNombres());
            ps.setString(2, cliente.getApellidos());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getCorreo());
            ps.setString(6, cliente.getContrasena());
            ResultSet rs = ps.executeQuery();
            clienteRespuesta.setResponse("ok");
            rs.close();
            ps.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clienteRespuesta;
    }

    @Override
    public ClienteRespuesta loginByEmail(ClienteRegister clienteRegister) {
        ClienteRespuesta clienteRespuesta = new ClienteRespuesta();
        String correo = null, contrasena = null;
        getConnection();
        try {
            String sql = "SELECT cl.correo, cl.contrasena FROM cliente cl WHERE cl.correo = ? AND cl.contrasena = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, clienteRegister.getCorreo());
            ps.setString(2, clienteRegister.getContrasena());
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                correo = rs.getString("correo");
                contrasena = rs.getString("contrasena");
            }
            rs.close();
            ps.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(correo != null && contrasena != null) clienteRespuesta.setResponse("ok");
        else clienteRespuesta.setResponse("not ok");
        return clienteRespuesta;
    }

    @Override
    public int getUserId(ClienteRegister clienteRegister) {
        int id_cliente = 0;
        getConnection();
        try {
            String sql = "SELECT cl.id_cliente FROM cliente cl WHERE cl.correo = ? AND cl.contrasena = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, clienteRegister.getCorreo());
            ps.setString(2, clienteRegister.getContrasena());
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                id_cliente = rs.getInt("id_cliente");
            }
            rs.close();
            ps.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id_cliente;
    }
}
