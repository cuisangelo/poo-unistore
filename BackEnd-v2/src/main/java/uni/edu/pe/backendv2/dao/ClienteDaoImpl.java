package uni.edu.pe.backendv2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;
import uni.edu.pe.backendv2.model.UsuarioRespuesta;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ClienteDaoImpl implements ClienteDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection connection;

    private Connection conexion;

    private void obtenerConexion(){
        try {
            this.conexion = jdbcTemplate.getDataSource().getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private void cerrarConexion(ResultSet resultado,Statement sentencia){
        try {
            if(resultado != null) resultado.close();
            if(sentencia != null) sentencia.close();
            this.conexion.commit();
            this.conexion.close();
            this.conexion = null;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

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
        return null;
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
        String sql = " SELECT cl.id_cliente, cl.nombres, cl.apellidos, cl.direccion, cl.telefono, \n" +
                "ct.correo, ct.contrasena FROM cliente cl\n" +
                "INNER JOIN cuenta ct ON (cl.id_cliente = ct.id_cliente) where cl.id_cliente = ?;";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, cliente.getId_cliente());
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                cliente = extraerCliente(resultado);
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cliente;
    }

    @Override
    public UsuarioRespuesta registerByEmail(UsuarioRegister usuarioRegister) {
        UsuarioRespuesta usuarioRespuesta = new UsuarioRespuesta();
        boolean flagRegistered = false;
        getConnection();
        try {
            String sql1 = "INSERT INTO cliente VALUES (NEXTVAL(id_cliente), ?, ?, ?, ?);";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setString(1, usuarioRegister.getNombres());
            ps1.setString(2, usuarioRegister.getApellidos());
            ps1.setString(3, usuarioRegister.getDireccion());
            ps1.setString(4, usuarioRegister.getTelefono());
            ResultSet rs1 = ps1.executeQuery();
            rs1.close();
            ps1.close();

            usuarioRespuesta.setResponse("ok");

            /*String sql2 = "INSERT INTO cuenta VALUES (?, ?, NEXTVAL(id_cliente));";
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps2.setString(1, usuarioRegister.getCorreo());
            ps2.setString(2, usuarioRegister.getContrasena());


            ResultSet rs2 = ps2.executeQuery();
            flagRegistered = true;

            rs2.close();

            ps2.close();*/
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*if(flagRegistered){
            return "ok";
        }
        else return "not ok";*/
        return usuarioRespuesta;
    }

    @Override
    public List<String> getUserData(UsuarioRegister usuarioRegister) {
        List<String> data = new ArrayList<>();
        getConnection();
        try {
            String sql = "SELECT * FROM cliente cl WHERE cl.id_cliente = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuarioRegister.getId_cliente());
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                data.add(rs.getString("nombres"));
                data.add(rs.getString("apellidos"));
                data.add(rs.getString("direccion"));
                data.add(rs.getString("telefono"));
                data.add(rs.getString("correo"));
                data.add(rs.getString("contrasena"));
            }
            rs.close();
            ps.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
}
