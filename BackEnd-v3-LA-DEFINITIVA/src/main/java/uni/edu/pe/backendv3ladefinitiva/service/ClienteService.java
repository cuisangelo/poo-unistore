package uni.edu.pe.backendv3ladefinitiva.service;


import uni.edu.pe.backendv3ladefinitiva.model.Cliente;
import uni.edu.pe.backendv3ladefinitiva.model.UsuarioCuenta;
import uni.edu.pe.backendv3ladefinitiva.model.UsuarioRegister;
import uni.edu.pe.backendv3ladefinitiva.model.Cliente;
import uni.edu.pe.backendv3ladefinitiva.model.UsuarioRegister;

import java.util.List;

public interface ClienteService {
    List<Cliente> obtenerCliente();
    

    String registerByEmail(UsuarioRegister usuarioRegister);

    Cliente obtenerClientePerfil(Cliente cliente);
}
