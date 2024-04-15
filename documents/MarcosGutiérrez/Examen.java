import java.util.Arrays;

public class Examen {

    private String tipo;
    private Profesor vigilante;
    private Asignatura asignatura;
    private int numeroPreguntas;
    private String[] preguntas;
    private String[] respuestas;

    private int espaciosPregunta = 0;

    public Examen(String tipo, Profesor vigilante, Asignatura asignatura, int numeroPreguntas) {
        this.tipo = tipo;
        this.vigilante = vigilante;
        this.asignatura = asignatura;
        this.numeroPreguntas = numeroPreguntas;
        this.preguntas = new String[numeroPreguntas];
    }

    public void crearPregunta(String pregunta, String respuesta) {
        for (int i = 0; i <= preguntas.length; i++) {
            if (preguntas[i] == null) {
                espaciosPregunta++;
            }
        }

        for (int i = numeroPreguntas; i > espaciosPregunta; i--) {
            preguntas[i] = pregunta;
            respuestas[i] = respuesta;
        }

    }

    public void crearPregunta(String pregunta) {
        int indice = 0;
        while (indice < preguntas.length && preguntas[indice] != null) {
            indice++;
        }
    
        if (indice < preguntas.length) {
           preguntas[indice] = pregunta;
        } else {
            System.out.println("No hay espacio disponible para agregar más preguntas.");
        }
    }

    public boolean correccion(int numeroPregunta) {
        if (numeroPregunta >= 0 && numeroPregunta < preguntas.length) {
            if (respuestas[numeroPregunta] != null) {
                return preguntas[numeroPregunta].equals(respuestas[numeroPregunta]);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String mostrarPreguntas() {
        StringBuilder informacion = new StringBuilder();
        for (int i = 0; i < numeroPreguntas; i++) {
            informacion.append("\t\tpregunta ").append(i+1).append(": ").append(preguntas[i]).append("\n");
        }
        return informacion.toString();
    }

    public String mostrar() {
        String informacion = "";
        informacion += "\tExamen: Examen " + tipo + " / Vigilado por Profª.: " + vigilante.mostrar();
        return informacion;
    }
}
