package uni.edu.pe.apprest.service;

import uni.edu.pe.apprest.model.Cliente;
import uni.edu.pe.apprest.model.Usuario;

import java.util.List;

public interface ClienteService {
    List<Cliente> obtenerCliente();

    Cliente agregarCliente(Cliente cliente);
}
