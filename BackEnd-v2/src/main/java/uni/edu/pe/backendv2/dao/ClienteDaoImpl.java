package uni.edu.pe.backendv2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;

import java.sql.*;
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
        return null;
    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        getConnection();
        try {
            String sql = " INSERT INTO cliente VALUES (NEXTVAL(id_cliente), ?, ?,?, ?,?,?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getId_cliente());
            ps.setString(2, cliente.getNombres());
            ps.setString(3, cliente.getApellidos());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getApellidos());
            ps.executeUpdate();
            closeConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cliente;
    }

    @Override
    public String registerByEmail(UsuarioRegister usuarioRegister) {
        boolean flagRegistered = false;
        getConnection();
        try {
            String sql1 = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?);";
            String sql2 = "INSERT INTO cuenta VALUES (?, ?, ?);";
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps1.setString(1, usuarioRegister.getId_cliente());
            ps1.setString(2, usuarioRegister.getNombres());
            ps1.setString(3, usuarioRegister.getApellidos());
            ps1.setString(4, usuarioRegister.getDireccion());
            ps1.setString(5, usuarioRegister.getTelefono());
            ps2.setString(1, usuarioRegister.getCorreo());
            ps2.setString(2, usuarioRegister.getContrasena());
            ps2.setString(3, usuarioRegister.getId_cliente());
            ResultSet rs1 = ps1.executeQuery();
            ResultSet rs2 = ps2.executeQuery();
            flagRegistered = true;
            rs1.close();
            rs2.close();
            ps1.close();
            ps2.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(flagRegistered){
            return "TRUE";
        }
        else return "FALSE";
    }
}
