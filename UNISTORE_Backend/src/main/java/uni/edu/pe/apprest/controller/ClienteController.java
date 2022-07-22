package uni.edu.pe.apprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.apprest.model.Cliente;
import uni.edu.pe.apprest.model.RespuestaCliente;
import uni.edu.pe.apprest.model.Usuario;
import uni.edu.pe.apprest.service.ClienteService;
import uni.edu.pe.apprest.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
public class ClienteController {
    @Autowired
    private ClienteService servicio;

    @RequestMapping(
            value = "/obtener-cliente",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaCliente obtenerCliente(){
        RespuestaCliente respuestaCliente = new RespuestaCliente(servicio.obtenerCliente());
        return respuestaCliente;
    }
}
