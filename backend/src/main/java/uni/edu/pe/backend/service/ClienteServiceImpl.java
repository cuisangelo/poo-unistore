package uni.edu.pe.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backend.dao.ClienteDao;
import uni.edu.pe.backend.model.Cliente;
import uni.edu.pe.backend.model.ClienteRespuesta;


import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteDao dao;
    @Override
    public List<Cliente> obtenerCliente() {
        return dao.obtenerCliente();
    }

    @Override
    public Cliente obtenerClientePerfil(Cliente cliente) {
        return dao.obtenerClientePerfil(cliente);
    }

    @Override
    public ClienteRespuesta registerByEmail(Cliente cliente) {
        return dao.registerByEmail(cliente);
    }

    @Override
    public ClienteRespuesta loginByEmail(Cliente cliente) {
        return dao.loginByEmail(cliente);
    }

    @Override
    public int getUserId(Cliente cliente) {
        return dao.getUserId(cliente);
    }
}
