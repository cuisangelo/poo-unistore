package uni.edu.pe.backend.dao;

import uni.edu.pe.backend.model.Cliente;
import uni.edu.pe.backend.model.ClienteRespuesta;

import java.util.List;

public interface ClienteDao {

    List<Cliente> obtenerCliente();

    Cliente obtenerClientePerfil(Cliente cliente);

    ClienteRespuesta registerByEmail(Cliente cliente);

    ClienteRespuesta loginByEmail(Cliente cliente);

    int getUserId(Cliente cliente);
}
