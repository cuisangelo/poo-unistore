package uni.edu.pe.backendv2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backendv2.dao.ClienteDao;
import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.ClienteRegister;
import uni.edu.pe.backendv2.model.ClienteRespuesta;

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
    public List<String> getUserData(ClienteRegister clienteRegister) {
        return dao.getUserData(clienteRegister);
    }

    @Override
    public Cliente obtenerClientePerfil(Cliente cliente) {
        return null;
    }

    @Override
    public ClienteRespuesta loginByEmail(ClienteRegister clienteRegister) {
        return dao.loginByEmail(clienteRegister);
    }

    @Override
    public ClienteRespuesta registerByEmail(ClienteRegister clienteRegister) {
        return dao.registerByEmail(clienteRegister);
    }

    @Override
    public int getUserId(ClienteRegister clienteRegister) {
        return dao.getUserId(clienteRegister);
    }

    /*public Cliente obtenerClientePerfil(Cliente cliente) {
        return dao.obtenerClientePerfil(cliente);
    }*/
}
