package uni.edu.pe.backendv2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String id_cliente;
    private String nombres;
    private String apellidos;
    private String  direccion;
    private String telefono ;
}
