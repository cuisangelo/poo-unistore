package uni.edu.pe.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.backend.model.Cliente;
import uni.edu.pe.backend.model.ClienteRespuesta;
import uni.edu.pe.backend.model.RespuestaCliente;
import uni.edu.pe.backend.model.ClienteRegister;
import uni.edu.pe.backend.service.ClienteService;

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
    public ClienteRespuesta registerByEmail(@RequestBody Cliente cliente) {
        return service.registerByEmail(cliente);
    }

    @RequestMapping(value = "/loginByEmail", method = RequestMethod.POST)
    public ClienteRespuesta loginByEmail(@RequestBody ClienteRegister clienteRegister) {
        return service.loginByEmail(clienteRegister);
    }

    @RequestMapping(value = "/getUserId", method = RequestMethod.POST)
    public int getUserId(@RequestBody ClienteRegister clienteRegister) {
        return service.getUserId(clienteRegister);
    }
}
