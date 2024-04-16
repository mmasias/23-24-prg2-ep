
public class Examen {

    private String nombre;
    private Profesor vigilante;
    private Pregunta[] preguntas;
    private int contadorPregunta;

    public Examen(String nombre) {
        this.nombre = nombre;
        this.preguntas = new Pregunta[3];
        this.contadorPregunta = 0;
    }

    public void asociarPregunta(Pregunta pregunta) {
        this.preguntas[contadorPregunta] = pregunta;
        this.contadorPregunta++;
    }

    public void asociarProfesorVigilante(Profesor vigilante) {
        this.vigilante = vigilante;
    }

    public String mostrar() {
        String laRespuesta =  this.nombre + " vigilado por " + this.vigilante.mostrarNombre();

        for(int i=0;i<contadorPregunta;i++){
            laRespuesta = laRespuesta + "\n - Pregunta ("+(i+1)+"):" + preguntas[i].mostrar();
        }

        return laRespuesta;

    }

}
