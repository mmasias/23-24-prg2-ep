
public class Profesor {

    private String nombre;
    private Asignatura asignatura;
    private String dni;

    public Profesor(String nombre) {
        this(nombre,"");
    }

    public Profesor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void asociarAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public void mostrar() {
        System.out.println(nombre + " imparte " + asignatura.mostrar());
    }

    public String mostrarNombre() {
        return this.nombre + " DNI: " + this.dni;
    }

}
