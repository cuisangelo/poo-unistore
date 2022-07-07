package uni.edu.pe;

public class Objeto {
    private String id_objeto;
    private String descripcion;
    private int cantidad;
    private float precio_unitario;

    public Objeto() {
    }

    public Objeto(String id_objeto, String descripcion, int cantidad, float precio_unitario) {
        this.id_objeto = id_objeto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public String getId_objeto() {
        return id_objeto;
    }

    public void setId_objeto(String id_objeto) {
        this.id_objeto = id_objeto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
}
