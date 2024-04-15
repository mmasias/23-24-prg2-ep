public class Profesor {
    private String nombreProfesor;
    private String profesorVigilando;
    private int dni;

    public Profesor(String nombreProfesor, String profesorVigilando, int dni) {
        this.nombreProfesor = nombreProfesor;
        this.profesorVigilando = profesorVigilando;
        this.dni = dni;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getProfesorVigilando() {
        return profesorVigilando;
    }

    public int getDni() {
        return dni;
    }
}
