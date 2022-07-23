package uni.edu.pe.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backend.dao.ProductoDao;
import uni.edu.pe.backend.model.Producto;

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
