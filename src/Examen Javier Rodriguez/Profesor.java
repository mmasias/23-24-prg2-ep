public class Profesor {

    private String nombre;
    private String apellido;
    private String nie;

    public Profesor(String nombre, String apellido, String nie) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nie = nie;
    }

    public void mostrarProfesor() {
        System.out.println("Nombre Profesor: " + nombre + " " + apellido + " - NIE: " + nie);
    }
}
