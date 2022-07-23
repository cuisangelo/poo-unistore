package uni.edu.pe.backendv2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.RespuestaCliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;
import uni.edu.pe.backendv2.service.ClienteService;

@RestController
@CrossOrigin(origins = "*")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @RequestMapping(
            value = "/obtener-cliente",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaCliente obtenerCliente(){
        RespuestaCliente respuestaCliente = new RespuestaCliente(service.obtenerCliente());
        return respuestaCliente;
    }
    @RequestMapping(
            value = "/agregar-cliente",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody Cliente agregarCliente(@RequestBody Cliente cliente){
        return service.agregarCliente(cliente);
    }

    @RequestMapping(value = "/registerByEmail", method = RequestMethod.POST)
    public String registerByEmail(@RequestBody UsuarioRegister usuarioRegister) {
        return service.registerByEmail(usuarioRegister);
    }
}
