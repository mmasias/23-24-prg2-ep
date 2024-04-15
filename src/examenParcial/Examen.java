package examenParcial;

public class Examen {

    private Asignatura asignatura;
    private Profesor profesor;
    private Preguntas preguntas;
    private Vigilante vigilante;
    private int puntaje;
    private String nombreEstudiante;

    public Examen(Asignatura asignatura, Profesor profesor, Preguntas preguntas, Vigilante vigilante) {
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.preguntas = preguntas;
        this.vigilante = vigilante;
    }

    public Asignatura asignatura() {
        return asignatura;
    }

    public Profesor profesor() {
        return profesor;
    }

    public Preguntas preguntas() {
        return preguntas;
    }

    public Vigilante vigilante() {
        return vigilante;
    }

    public void puntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String nombreEstudiante() {
        return nombreEstudiante;
    }

    public void establecerNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Manuel Masias", "666999XY");
        Asignatura asignatura = new Asignatura("Progra 2", profesor);
        Preguntas preguntas = new Preguntas("Vista publica clases",
                "Vista publica objetos",
                "Vista privada de clases");
        Vigilante vigilante = new Vigilante("Loyda Alas", "433452A");

        asignatura.establecerCreditos(6);

        Examen examen = new Examen(asignatura, profesor, preguntas, vigilante);

        examen.establecerNombreEstudiante("David Reyes");

        System.out.println("Nombre del estudiante: " + examen.nombreEstudiante());
        System.out.println("Asignatura del examen: " + examen.asignatura().name());
        System.out.println("Créditos de la asignatura: " + examen.asignatura().creditos());
        System.out.println("Profesor del examen: " + examen.profesor().nombre());
        System.out.println("DNI del profesor: " + examen.profesor().dni());
        System.out.println("Vigilante del examen: " + examen.vigilante().name());
        System.out.println("DNI del vigilante: " + examen.vigilante().dni());
        System.out.println("Pregunta 1: " + examen.preguntas().primeraPregunta());
        System.out.println("Pregunta 2: " + examen.preguntas().segundaPregunta());
        System.out.println("Pregunta 3: " + examen.preguntas().terceraPregunta());
    }
}
