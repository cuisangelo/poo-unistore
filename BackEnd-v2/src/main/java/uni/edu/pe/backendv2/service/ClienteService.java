package uni.edu.pe.backendv2.service;


import uni.edu.pe.backendv2.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> obtenerCliente();

    Cliente agregarCliente(Cliente cliente);
}
