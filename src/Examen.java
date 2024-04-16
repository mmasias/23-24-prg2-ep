public class Examen {
    private String name;
    private Profesor vigilante;
    private Pregunta pregunta1;
    private Pregunta pregunta2;
    private Pregunta pregunta3;

    public Examen(String name, Profesor vigilante, Pregunta pregunta1, Pregunta pregunta2, Pregunta pregunta3) {
        this.name = name;
        this.vigilante = vigilante;
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
    }

    public String getName() {
        return name;
    }
}
