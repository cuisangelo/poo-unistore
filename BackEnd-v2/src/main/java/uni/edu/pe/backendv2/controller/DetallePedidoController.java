package uni.edu.pe.backendv2.controller;

import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "*")
public class DetallePedidoController {
    /*@Autowired
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
