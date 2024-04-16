public class Profesor {
    private String nombre;
    private String nie;
    private Asignatura asignatura;


    public Profesor() {
        this.nombre = "";
        this.nie = "";
        this.asignatura = null;
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.nie = "";
        this.asignatura = null;
    }

    public Profesor(String nombre, String nie) {
        this.nombre = nombre;
        this.nie = nie;
        this.asignatura = null;
    }

    public Profesor(String nombre, Asignatura asignatura, String nie) {
        this.nombre = nombre;
        this.nie = nie;
        this.asignatura = asignatura;
    }

    public void modificar(Profesor profesor) {
        if (profesor != null) {
            this.nombre = profesor.nombre;
            this.nie = profesor.nie;
            this.asignatura = profesor.asignatura;
        } else {
            System.out.println("El profesor proporcionado es incorrecto");
        }
    }
}
