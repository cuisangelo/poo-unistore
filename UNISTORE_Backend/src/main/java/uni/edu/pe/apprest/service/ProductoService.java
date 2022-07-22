package uni.edu.pe.apprest.service;

import uni.edu.pe.apprest.model.Producto;

import java.util.List;

public interface ProductoService {
    Producto obtenerProducto(Producto producto);

    List<Producto> obtenerProductos();
}
