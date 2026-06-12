package uni.edu.pe;

public class Cliente extends Usuario {
    private String id_cliente;

    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, String direccion, String telefono, String id_cliente) {
        super(nombres, apellidos, direccion, telefono);
        this.id_cliente = id_cliente;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }
}
