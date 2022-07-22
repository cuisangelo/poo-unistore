package uni.edu.pe.apprest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.apprest.model.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDaoImpl implements ProductoDao{
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
    private Producto extraerProducto(ResultSet resultado) throws SQLException {
        Producto producto = new Producto(
                resultado.getString("id_producto"),
                resultado.getString("nombre"),
                resultado.getString("descripcion"),
                resultado.getInt("cantidad"),
                resultado.getFloat("precio_oferta"),
                resultado.getFloat("precio_unitario"),
                resultado.getString("url_imagen")
        );
        return producto;
    }

    @Override
    public List<Producto> obtenerProductos() {
        List<Producto> lista = new ArrayList<>();
        String sql = " SELECT pr.id_producto, pr.nombre, pr.descripcion, pr.cantidad, pr.precio_unitario, pr.precio_oferta, pr.url_imagen FROM producto pr;";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                lista.add(extraerProducto(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }
    @Override
    public Producto obtenerProducto(Producto producto) {
        String sql = " SELECT pr.id_producto, pr.nombre, pr.descripcion, pr.cantidad, pr.precio_unitario, pr.precio_oferta, pr.url_imagen FROM producto pr;";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                producto = extraerProducto(resultado);
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return producto;
    }
}
