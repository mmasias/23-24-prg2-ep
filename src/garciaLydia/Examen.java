package src.garciaLydia;

public class Examen {
    private Asignatura asignatura;
    private String profesorVigilante;
    private String preguntas;

    public Examen(Asignatura asignatura, String profesorVigilante, String preguntas) {
        this.asignatura = asignatura;
        this.profesorVigilante = profesorVigilante;
        this.preguntas = preguntas;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public String getProfesorVigilante() {
        return profesorVigilante;
    }

    public void setProfesorVigilante(String profesorVigilante) {
        this.profesorVigilante = profesorVigilante;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }
}
