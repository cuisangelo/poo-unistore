package uni.edu.pe.backendv2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backendv2.dao.ClienteDao;
import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;

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
