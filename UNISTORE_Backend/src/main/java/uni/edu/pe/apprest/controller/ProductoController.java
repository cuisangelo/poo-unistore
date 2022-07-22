package uni.edu.pe.apprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.apprest.model.Producto;
import uni.edu.pe.apprest.model.RespuestaProducto;
import uni.edu.pe.apprest.service.ProductoService;

@RestController
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    ProductoService servicio;

    @RequestMapping(
            value = "/obtener-productos",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaProducto obtenerProductos(){
        RespuestaProducto respuestaProducto = new RespuestaProducto();
        respuestaProducto.setLista(servicio.obtenerProductos());
        return respuestaProducto;
    }

    @RequestMapping(
            value = "/obtener-producto",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody Producto obtenerProducto(@RequestBody Producto producto){
        return servicio.obtenerProducto(producto);
    }
}
