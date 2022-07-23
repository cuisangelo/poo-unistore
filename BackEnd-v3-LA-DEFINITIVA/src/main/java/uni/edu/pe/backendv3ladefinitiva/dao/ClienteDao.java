package uni.edu.pe.backendv3ladefinitiva.dao;

import uni.edu.pe.backendv3ladefinitiva.model.Cliente;
import uni.edu.pe.backendv3ladefinitiva.model.UsuarioRegister;

import java.util.List;

public interface ClienteDao {

    List<Cliente> obtenerCliente();

    String registerByEmail(UsuarioRegister usuarioRegister);

    Cliente obtenerClientePerfil(Cliente cliente);
}
