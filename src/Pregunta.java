package examenParcial;

public class Pregunta {
    
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;

    
    public Pregunta() {
    }


    public Pregunta(String pregunta1, String pregunta2, String pregunta3) {
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
    }


    public String mostrarPreguntas(){
        return "Pregunta 1: " + pregunta1 + "\n" + "Pregunta 2: " + pregunta2 + "\n" + "Pregunta 3: " + pregunta3;
    }
}
