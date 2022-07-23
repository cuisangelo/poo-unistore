package uni.edu.pe.backendv2.dao;

import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.ClienteRegister;
import uni.edu.pe.backendv2.model.ClienteRespuesta;

import java.util.List;

public interface ClienteDao {
    List<Cliente> obtenerCliente();

    Cliente agregarCliente(Cliente cliente);

    ClienteRespuesta registerByEmail(ClienteRegister clienteRegister);

    List<String> getUserData(ClienteRegister clienteRegister);

    Cliente obtenerClientePerfil(Cliente cliente);

    ClienteRespuesta loginByEmail(ClienteRegister clienteRegister);
}
