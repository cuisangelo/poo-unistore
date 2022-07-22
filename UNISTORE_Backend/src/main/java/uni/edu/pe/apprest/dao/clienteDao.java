package uni.edu.pe.apprest.dao;

import uni.edu.pe.apprest.model.Cliente;
import uni.edu.pe.apprest.model.Usuario;

import java.util.List;

public interface clienteDao {
    List<Cliente> obtenerCliente();

    Cliente agregarCliente(Cliente cliente);
}
