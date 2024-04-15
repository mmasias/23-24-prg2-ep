import java.util.Arrays;

public class Profesor {
    private String asignatura;
    private String[] preguntas;
    private String[] respuestasCorrectas;
    private String[] respuestasDadas;
    private Vigilante vigilante;

    public Profesor(String asignatura, String[] preguntas, String[] respuestasCorrectas, Vigilante vigilante) {
        this.asignatura = asignatura;
        this.preguntas = preguntas;
        this.respuestasCorrectas = respuestasCorrectas;
        this.vigilante = vigilante;
        this.respuestasDadas = new String[preguntas.length];
    }
    
    public void respuestasPreguntas(String[] respuestasDadas) {
        if (respuestasDadas.length == preguntas.length) {
            this.respuestasDadas = respuestasDadas;
        } else {
            System.out.println("Error: El número de respuestas proporcionadas no coincide con el número de preguntas.");
        }
    }

    public boolean aciertoPregunta(int index) {
        return respuestasDadas[index].equals(respuestasCorrectas[index]);
    }

    public int numeroAciertos() {
        int aciertos = 0;
        for (int i = 0; i < preguntas.length; i++) {
            if (aciertoPregunta(i)) {
                aciertos++;
            }
        }
        return aciertos;
    }

    public boolean aprobado() {
        int aciertos = numeroAciertos();
        return aciertos >= (preguntas.length / 2);
    }

    @Override
    public String toString() {
        return asignatura;
    }
    public static void main(String[] args) {
        String[] preguntas = {"Pregunta 1", "Pregunta 2", "Pregunta 3"};
        String[] respuestasCorrectas = {"1", "2", "3"};
        String[] respuestasAlumno = {"0", "2", "3"};
        
        Vigilante vigilante = new Vigilante("Loyda ", "666999XY");
        Profesor profesor = new Profesor("Programación 2", preguntas, respuestasCorrectas, vigilante);
        profesor.respuestasPreguntas(respuestasAlumno);

        System.out.println("Examen Parcial:");
        System.out.println("Asignatura: " + profesor.toString());
        System.out.println("Vigilante: " + vigilante.toString());
        System.out.println("Preguntas: " + Arrays.toString(preguntas));
        System.out.println("Respuestas dadas: " + Arrays.toString(respuestasAlumno));
        System.out.println("Aciertos: " + profesor.numeroAciertos());
        System.out.println("Aprobado: " + profesor.aprobado());
    }
}