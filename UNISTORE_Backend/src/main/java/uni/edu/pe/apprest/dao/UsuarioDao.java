package uni.edu.pe.apprest.dao;

import uni.edu.pe.apprest.model.Usuario;

public interface UsuarioDao {
    String loginByEmail(Usuario usuario);
}
