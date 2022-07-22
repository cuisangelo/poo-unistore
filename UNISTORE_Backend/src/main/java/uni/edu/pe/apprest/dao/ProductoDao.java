package uni.edu.pe.apprest.dao;

import uni.edu.pe.apprest.model.Producto;

import java.util.List;

public interface ProductoDao {
    Producto obtenerProducto(Producto producto);

    List<Producto> obtenerProductos();
}
