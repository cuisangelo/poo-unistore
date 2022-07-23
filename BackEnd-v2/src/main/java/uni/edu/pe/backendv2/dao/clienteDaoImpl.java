package uni.edu.pe.backendv2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.backendv2.model.Cliente;

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
            ps.setString(1, cliente.getId_cliente());
            ps.setString(2, cliente.getNombres());
            ps.setString(3, cliente.getApellidos());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getApellidos());
            ps.executeUpdate();
            cerrarConexion(null, ps);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cliente;
    }
}
