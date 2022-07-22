package uni.edu.pe.apprest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.apprest.model.Cliente;
import uni.edu.pe.apprest.model.Usuario;

import java.sql.*;
import java.util.List;
@Repository
public class clienteDaoImpl implements clienteDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Connection conexion;

    private void obtenerConexion(){
        try {
            this.conexion = jdbcTemplate.getDataSource().getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private void cerrarConexion(ResultSet resultado, Statement sentencia){
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
    @Override
    public List<Cliente> obtenerCliente() {
        return null;
    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        obtenerConexion();
        try {
            String sql = " INSERT INTO cliente VALUES (NEXTVAL(id_cliente), ?, ?,?, ?,?,?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            sentencia.setString(1, cliente.getNombres());
            sentencia.setString(2, cliente.getApellidos());
            sentencia.setString(3, cliente.getDireccion());
            sentencia.setString(4, cliente.getTelefono());
            sentencia.setString(5, cliente.getCorreo());
            sentencia.setString(6, cliente.getContrasena());
            sentencia.executeUpdate();
            cerrarConexion(null,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cliente;
    }
}
