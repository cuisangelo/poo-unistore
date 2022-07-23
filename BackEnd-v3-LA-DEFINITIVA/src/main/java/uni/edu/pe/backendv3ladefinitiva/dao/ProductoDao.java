package uni.edu.pe.backendv3ladefinitiva.dao;

import uni.edu.pe.backendv2.model.Producto;

import java.util.List;

public interface ProductoDao {
    Producto obtenerProducto(Producto producto);

    List<Producto> obtenerProductos();
}
