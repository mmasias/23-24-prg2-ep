package ExamenParcial;

public class Examen {
    private String fecha;
    private int horaInicio;
    private int horaFin;
    private Vigilante vigilante;
    private Asignatura asignatura;
    private Preguntas preguntas;
    private int puntuaje;
    private String estudiante;

    public Examen(String fecha, int horaInicio, int horaFin, Vigilante vigilante, Asignatura asignatura, Preguntas preguntas, int puntuaje, String estudiante) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.vigilante = vigilante;
        this.asignatura = asignatura;
        this.preguntas = preguntas;
        this.puntuaje = puntuaje;
        this.estudiante = estudiante;
    }

    public Vigilante getVigilante() {
        return vigilante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public boolean preguntaCorrecta() {
        return true;
    }

    public int getPuntuaje() {
        return puntuaje;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }
}
