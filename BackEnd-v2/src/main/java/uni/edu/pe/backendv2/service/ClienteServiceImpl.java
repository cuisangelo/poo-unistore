package uni.edu.pe.backendv2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backendv2.dao.clienteDao;
import uni.edu.pe.backendv2.model.Cliente;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private clienteDao dao;
    @Override
    public List<Cliente> obtenerCliente() {
        return dao.obtenerCliente();
    }

    @Override
    public Cliente agregarCliente(Cliente cliente) {
        return dao.agregarCliente(cliente);
    }
}
