package uni.edu.pe.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRegister {
    private String id_cliente;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correo;
    private String contrasena;

    public void ASD(){

    }
}
