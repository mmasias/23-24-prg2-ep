package ExamenParcial;

public class Preguntas {
    private String[] preguntas;

    public Preguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public int getNumeroPreguntas() {
        return preguntas.length;
    }

    public String[] getPreguntas() {
        return preguntas;
    }
}
