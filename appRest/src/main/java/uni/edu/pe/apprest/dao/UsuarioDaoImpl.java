package uni.edu.pe.apprest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.apprest.model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
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
    public String register(Usuario usuario) {
        boolean flagRegistered = false;
        getConnection();
        try {
            String sql = "insert into usuario_contrasena values(?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getId_usuario());
            ps.setString(2, usuario.getContrasena());
            ResultSet rs = ps.executeQuery();
            flagRegistered = true;
            rs.close();
            ps.close();
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
