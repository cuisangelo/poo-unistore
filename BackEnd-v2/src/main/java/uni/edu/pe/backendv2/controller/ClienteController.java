package uni.edu.pe.backendv2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
import uni.edu.pe.backendv2.model.*;
=======
import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.RespuestaCliente;
import uni.edu.pe.backendv2.model.UsuarioRegister;
>>>>>>> aec717f7d6c97c4f9dd5df2c5dd570a068a62885
import uni.edu.pe.backendv2.service.ClienteService;

import java.util.List;

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
    public UsuarioRespuesta registerByEmail(@RequestBody UsuarioRegister usuarioRegister) {
        return service.registerByEmail(usuarioRegister);
    }

    @RequestMapping(value = "/getUserData", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public List<String> getUserData(@RequestBody UsuarioRegister usuarioRegister) {
        return service.getUserData(usuarioRegister);
    }
}
