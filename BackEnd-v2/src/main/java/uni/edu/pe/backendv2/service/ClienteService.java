package uni.edu.pe.backendv2.service;


import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;
import uni.edu.pe.backendv2.model.UsuarioRespuesta;

import java.util.List;

public interface ClienteService {
    List<Cliente> obtenerCliente();
    

<<<<<<< HEAD
    UsuarioRespuesta registerByEmail(UsuarioRegister usuarioRegister);

    List<String> getUserData(UsuarioRegister usuarioRegister);
=======
    String registerByEmail(UsuarioRegister usuarioRegister);

    Cliente obtenerClientePerfil(Cliente cliente);
>>>>>>> aec717f7d6c97c4f9dd5df2c5dd570a068a62885
}
