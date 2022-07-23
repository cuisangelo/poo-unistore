package uni.edu.pe.backendv2.service;


import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;

import java.util.List;

public interface ClienteService {
    List<Cliente> obtenerCliente();
    

    String registerByEmail(UsuarioRegister usuarioRegister);

    Cliente obtenerClientePerfil(Cliente cliente);
}
