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
    public String loginByEmail(Usuario usuario) {
        boolean flagFound = false;
        getConnection();
        try {
            String sql = "SELECT cc.correo, cc.contrasena FROM correo_contrasena cc;";
            PreparedStatement ps = connection.prepareStatement(sql);
            /*ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getContrasena());*/
            ResultSet rs = ps.executeQuery();
            rs.close();
            ps.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(flagFound) return "ok";
        else return "not ok";
    }
}
