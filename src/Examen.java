public class Examen {
    private String tipo;
    private Profesor profesorVigilante;
    private Pregunta[] preguntas;

    public Examen(String tipo, Profesor profesorVigilante, Pregunta[] preguntas){
        this.tipo = tipo;
        this.profesorVigilante = profesorVigilante;
        this.preguntas = preguntas;
    }

    public String mostrar(){
        return "Tipo [" + tipo + "] / profesorVigilante[" + profesorVigilante + "] / Preguntas[" + preguntas +"]";
    }

    public void añadirPregunta(Pregunta pregunta){

    }
}
