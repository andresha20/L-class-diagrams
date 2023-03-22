public class Cliente {
    private int telefono, cedula;
    private String nombres, apellidos, direccion;

    public Cliente(int cedula, String nombres, String apellidos, String direccion, int telefono) {
        this.telefono = telefono;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }
}