package uni.edu.pe.backendv3ladefinitiva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.backendv3ladefinitiva.model.Cliente;
import uni.edu.pe.backendv3ladefinitiva.model.ClienteRespuesta;
import uni.edu.pe.backendv3ladefinitiva.model.RespuestaCliente;
import uni.edu.pe.backendv3ladefinitiva.model.ClienteRegister;
import uni.edu.pe.backendv3ladefinitiva.service.ClienteService;

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
            value = "/obtener-cliente-perfil",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody Cliente obtenerClientePerfil(@RequestBody Cliente cliente){
        return service.obtenerClientePerfil(cliente);
    }

    @RequestMapping(value = "/registerByEmail", method = RequestMethod.POST)
    public ClienteRespuesta registerByEmail(@RequestBody ClienteRegister clienteRegister) {
        return service.registerByEmail(clienteRegister);
    }

    @RequestMapping(value = "/loginByEmail", method = RequestMethod.POST)
    public ClienteRespuesta loginByEmail(@RequestBody ClienteRegister clienteRegister) {
        return service.loginByEmail(clienteRegister);
    }
}
