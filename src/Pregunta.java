public class Pregunta{
    private String pregunta;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
    }    
    public Pregunta cambiarPregunta(Pregunta pregunta) {
        return pregunta;
    }
}
public static void main(String[] args) {

    Pregunta pregunta;
    pregunta = new Pregunta("¿Cuántos años tiene la Luna?");

    Pregunta pregunta2 = new Pregunta("¿Cuánto mide la Universidad Europea del Atlántico?");

    Pregunta pregunta3 = new Pregunta("¿Cuánto hay que hacer para aprobar el examen?");     
}