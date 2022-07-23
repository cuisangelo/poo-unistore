package uni.edu.pe.backendv2.model;

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
