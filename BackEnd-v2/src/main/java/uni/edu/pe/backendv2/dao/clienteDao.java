package uni.edu.pe.backendv2.dao;

import uni.edu.pe.backendv2.model.Cliente;

import java.util.List;

public interface clienteDao {
    List<Cliente> obtenerCliente();

    Cliente agregarCliente(Cliente cliente);
}
