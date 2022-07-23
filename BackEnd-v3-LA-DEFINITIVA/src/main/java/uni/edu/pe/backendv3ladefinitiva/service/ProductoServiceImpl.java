package uni.edu.pe.backendv3ladefinitiva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backendv2.dao.ProductoDao;
import uni.edu.pe.backendv2.model.Producto;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoDao dao;
    @Override
    public Producto obtenerProducto(Producto producto) {
        return dao.obtenerProducto(producto);
    }

    @Override
    public List<Producto> obtenerProductos() {
        return dao.obtenerProductos();
    }
}
