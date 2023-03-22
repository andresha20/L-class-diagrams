public class Mascota {
    private int id, edad, peso, cedula_cliente;
    private String nombre, raza, medicamento;

    public Mascota(int id, int edad, int peso, int cedula_cliente, String nombre, String raza, String medicamento) {
        this.edad = edad;
        this.peso = peso;
        this.cedula_cliente = cedula_cliente;
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.medicamento = medicamento;
    }
}
