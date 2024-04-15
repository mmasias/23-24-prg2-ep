package examenParcial;

public class Preguntas {

    private String primeraPregunta;
    private String segundaPregunta;
    private String terceraPregunta;

    public Preguntas(String primeraPregunta, String segundaPregunta, String terceraPregunta) {
        this.primeraPregunta = primeraPregunta;
        this.segundaPregunta = segundaPregunta;
        this.terceraPregunta = terceraPregunta;
    }

    public String primeraPregunta() {
        return primeraPregunta;
    }

    public String segundaPregunta() {
        return segundaPregunta;
    }

    public String terceraPregunta() {
        return terceraPregunta;
    }

    public static void main(String[] args) {
        Preguntas preguntas = new Preguntas("Vista publica clases",
                "Viista publica de objetos",
                "Vusta privada de clases");

        System.out.println("Primera pregunta: " + preguntas.primeraPregunta());
        System.out.println("Segunda pregunta: " + preguntas.segundaPregunta());
        System.out.println("Tercera pregunta: " + preguntas.terceraPregunta());
    }
}
