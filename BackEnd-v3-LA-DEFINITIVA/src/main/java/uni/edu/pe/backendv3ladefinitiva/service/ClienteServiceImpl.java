package uni.edu.pe.backendv3ladefinitiva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backendv3ladefinitiva.dao.ClienteDao;
import uni.edu.pe.backendv3ladefinitiva.model.Cliente;
import uni.edu.pe.backendv3ladefinitiva.model.UsuarioRegister;


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
    public String registerByEmail(UsuarioRegister usuarioRegister) {
        return dao.registerByEmail(usuarioRegister);
    }

    @Override
    public Cliente obtenerClientePerfil(Cliente cliente) {
        return dao.obtenerClientePerfil(cliente);
    }
}
