package uni.edu.pe.backend.service;

import uni.edu.pe.backend.model.Cliente;
import uni.edu.pe.backend.model.ClienteRegister;
import uni.edu.pe.backend.model.ClienteRespuesta;

import java.util.List;

public interface ClienteService {
    List<Cliente> obtenerCliente();

    Cliente obtenerClientePerfil(Cliente cliente);

    ClienteRespuesta registerByEmail(Cliente cliente);

    ClienteRespuesta loginByEmail(ClienteRegister clienteRegister);

    int getUserId(ClienteRegister clienteRegister);
}
