package uni.edu.pe.backendv3ladefinitiva.service;

import uni.edu.pe.backendv3ladefinitiva.model.Producto;

import java.util.List;

public interface ProductoService {
    Producto obtenerProducto(Producto producto);

    List<Producto> obtenerProductos();
}
