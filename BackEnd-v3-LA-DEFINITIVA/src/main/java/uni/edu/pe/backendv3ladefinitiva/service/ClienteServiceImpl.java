package uni.edu.pe.backendv3ladefinitiva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backendv3ladefinitiva.dao.ClienteDao;
import uni.edu.pe.backendv3ladefinitiva.model.Cliente;
import uni.edu.pe.backendv3ladefinitiva.model.ClienteRegister;
import uni.edu.pe.backendv3ladefinitiva.model.ClienteRespuesta;


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
    public ClienteRespuesta registerByEmail(ClienteRegister clienteRegister) {
        return dao.registerByEmail(clienteRegister);
    }

    @Override
    public ClienteRespuesta loginByEmail(ClienteRegister clienteRegister) {
        return dao.loginByEmail(clienteRegister);
    }
}
