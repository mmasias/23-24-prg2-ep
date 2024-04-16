public class Profesor {
    private String name;
    private String nie;
    private String dni;
    private Asignatura asignatura;

    public Profesor(String name, String nie, Asignatura asignatura) {
        this.name = name;
        this.nie = nie;
        this.asignatura = asignatura;
    }

    public Profesor(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public String getNie() {
        return nie;
    }

    public String getDni() {
        return dni;
    }
}
