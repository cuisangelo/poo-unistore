package uni.edu.pe.apprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.apprest.model.RespuestaProducto;
import uni.edu.pe.apprest.model.Usuario;
import uni.edu.pe.apprest.service.ProductoService;

@RestController
@CrossOrigin(origins = "*")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoService servicio;

    @RequestMapping(
            value = "/obtener-carro-de-compras",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaProducto obtenerCarroCompras(){
        RespuestaProducto respuestaProducto = new RespuestaProducto();
        respuestaProducto.setLista(servicio.obtenerProductos());
        return respuestaProducto;
    }
    /*@RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestBody Usuario usuario) {
        return service.register(usuario);
    }*/
}
