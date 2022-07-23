package uni.edu.pe.backendv2.service;

import uni.edu.pe.backendv2.model.Producto;

import java.util.List;

public interface ProductoService {
    Producto obtenerProducto(Producto producto);

    List<Producto> obtenerProductos();
}
