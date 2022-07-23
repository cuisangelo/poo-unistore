package uni.edu.pe.backendv3ladefinitiva.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteCuenta {
    private String correo;
    private String contrasena;
}
