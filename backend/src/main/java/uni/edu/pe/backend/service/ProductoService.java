package uni.edu.pe.backend.service;

import uni.edu.pe.backend.model.Producto;

import java.util.List;

public interface ProductoService {
    Producto obtenerProducto(Producto producto);

    List<Producto> obtenerProductos();
}
