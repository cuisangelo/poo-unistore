package uni.edu.pe.apprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.apprest.model.Usuario;
import uni.edu.pe.apprest.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestBody Usuario usuario) {
        return service.register(usuario);
    }
}
