package uni.edu.pe;

public class Pedido {
    private String id_pedido;
    private String fecha_pedido;
    private String fecha_entraga;
    private String id_cliente;

    public Pedido() {
    }

    public Pedido(String id_pedido, String fecha_pedido, String fecha_entraga, String id_cliente) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entraga = fecha_entraga;
        this.id_cliente = id_cliente;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getFecha_entraga() {
        return fecha_entraga;
    }

    public void setFecha_entraga(String fecha_entraga) {
        this.fecha_entraga = fecha_entraga;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }
}
