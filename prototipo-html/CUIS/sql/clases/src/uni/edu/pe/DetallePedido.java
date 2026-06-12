package uni.edu.pe;

public class DetallePedido {
    private String id_detalle;
    private int cantidad;
    private float precio_unitario;
    private String id_objeto;

    public DetallePedido() {
    }

    public DetallePedido(String id_detalle, int cantidad, float precio_unitario, String id_objeto) {
        this.id_detalle = id_detalle;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.id_objeto = id_objeto;
    }

    public String getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(String id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getId_objeto() {
        return id_objeto;
    }

    public void setId_objeto(String id_objeto) {
        this.id_objeto = id_objeto;
    }
}
