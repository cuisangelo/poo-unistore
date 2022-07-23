package uni.edu.pe.backendv2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.backendv2.dao.ClienteDao;
import uni.edu.pe.backendv2.model.Cliente;
import uni.edu.pe.backendv2.model.UsuarioCuenta;
import uni.edu.pe.backendv2.model.UsuarioRegister;
import uni.edu.pe.backendv2.model.UsuarioRespuesta;

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
    public UsuarioRespuesta registerByEmail(UsuarioRegister usuarioRegister) {
        return dao.registerByEmail(usuarioRegister);
    }

    @Override
<<<<<<< HEAD
    public List<String> getUserData(UsuarioRegister usuarioRegister) {
        return dao.getUserData(usuarioRegister);
=======
    public Cliente obtenerClientePerfil(Cliente cliente) {
        return dao.obtenerClientePerfil(cliente);
>>>>>>> aec717f7d6c97c4f9dd5df2c5dd570a068a62885
    }
}
