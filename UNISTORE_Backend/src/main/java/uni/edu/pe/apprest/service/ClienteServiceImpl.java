package uni.edu.pe.apprest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.apprest.dao.clienteDao;
import uni.edu.pe.apprest.model.Cliente;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private clienteDao dao;
    @Override
    public List<Cliente> obtenerCliente() {
        return dao.obtenerCliente();
    }
}
