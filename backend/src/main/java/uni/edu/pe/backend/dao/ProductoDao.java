package uni.edu.pe.backend.dao;

import uni.edu.pe.backend.model.Producto;

import java.util.List;

public interface ProductoDao {
    Producto obtenerProducto(Producto producto);

    List<Producto> obtenerProductos();
}
