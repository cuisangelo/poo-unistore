package uni.edu.pe.backendv2.dao;

import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;
import uni.edu.pe.backendv2.model.UsuarioRespuesta;

import java.util.List;

public interface ClienteDao {
    List<Cliente> obtenerCliente();

    Cliente agregarCliente(Cliente cliente);

    UsuarioRespuesta registerByEmail(UsuarioRegister usuarioRegister);

    List<String> getUserData(UsuarioRegister usuarioRegister);
}
