package uni.edu.pe;

public class Alumno extends Usuario {
    private String id_alumno;

    public Alumno() {
    }

    public Alumno(String nombres, String apellidos, String direccion, String telefono, String id_alumno) {
        super(nombres, apellidos, direccion, telefono);
        this.id_alumno = id_alumno;
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }
}
