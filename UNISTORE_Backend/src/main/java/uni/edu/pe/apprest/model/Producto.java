package uni.edu.pe.apprest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private String id_producto;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private float precio_unitario;
    private float precio_oferta;
    private String url_imagen;
}
