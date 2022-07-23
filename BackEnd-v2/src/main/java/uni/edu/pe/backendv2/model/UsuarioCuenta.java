package uni.edu.pe.backendv2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioCuenta {
    private String usuario;
    private String contrasena;
}
