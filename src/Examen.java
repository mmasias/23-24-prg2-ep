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
        String salida = "Examen: Examen " + tipo + " / Vigilado por Prof.: " + profesorVigilante.mostrar();
        for (Pregunta pregunta : preguntas) {
            salida += "\n       " + pregunta.mostrar();
        }
        return salida;
    }

    public void anadirPregunta(Pregunta pregunta){
        Pregunta[] preguntasNuevo = new Pregunta[preguntas.length + 1];
        for(int numero = 0; numero < preguntas.length; numero++){
            preguntasNuevo[numero] = preguntas[numero];
        }
        preguntasNuevo[preguntas.length] = pregunta;
        preguntas = preguntasNuevo;
    }
}
