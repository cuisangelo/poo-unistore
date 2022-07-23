package uni.edu.pe.backendv2.dao;

import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;

import java.util.List;

public interface ClienteDao {
    List<Cliente> obtenerCliente();

    Cliente agregarCliente(Cliente cliente);

    String registerByEmail(UsuarioRegister usuarioRegister);
}
