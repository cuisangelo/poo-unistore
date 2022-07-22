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
    private String id_producto;
    private String descripcion;
    private int cantidad_seleccionada;
    private float precio_unitario ;
    private float sub_precio;
    private String url_imagen;
}
