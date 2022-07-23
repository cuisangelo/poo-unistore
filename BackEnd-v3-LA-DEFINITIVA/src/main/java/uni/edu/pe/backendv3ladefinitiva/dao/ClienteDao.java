package uni.edu.pe.backendv3ladefinitiva.dao;

import uni.edu.pe.backendv3ladefinitiva.model.Cliente;
import uni.edu.pe.backendv3ladefinitiva.model.ClienteRegister;
import uni.edu.pe.backendv3ladefinitiva.model.ClienteRespuesta;

import java.util.List;

public interface ClienteDao {

    List<Cliente> obtenerCliente();

    Cliente obtenerClientePerfil(Cliente cliente);

    ClienteRespuesta registerByEmail(ClienteRegister clienteRegister);

    ClienteRespuesta loginByEmail(ClienteRegister clienteRegister);
}
