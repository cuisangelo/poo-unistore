package uni.edu.pe.apprest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String id_detalle;
    private String id_cliente;
    private String id_producto VARCHAR(5);
    private String descripcion VARCHAR(100);
    cantidad_seleccionada NUMERIC(3);
    precio_unitario NUMERIC (9, 2);
    sub_precio NUMERIC (9, 2),
    private String url_imagen VARCHAR(500),
}
