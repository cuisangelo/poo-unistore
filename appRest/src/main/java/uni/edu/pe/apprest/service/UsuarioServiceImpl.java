package uni.edu.pe.apprest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.apprest.dao.UsuarioDao;
import uni.edu.pe.apprest.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDao dao;

    @Override
    public String register(Usuario usuario) {
        return dao.register(usuario);
    }
}
