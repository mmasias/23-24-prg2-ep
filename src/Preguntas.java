public class Preguntas {
    private String[] preguntas;
    private int size;

    public Preguntas() {
        this.preguntas = new String[3];
        this.size = 0;
    }

    public Preguntas(String pregunta) {
        this();
        this.preguntas[0] = pregunta;
        this.size = 1;
    }

    public void modificar(int indice, String nuevaPregunta) {
        if (indice >= 0 && indice < size) {
            preguntas[indice] = nuevaPregunta;
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void añadir(String pregunta) {
        if (size < preguntas.length) {
            preguntas[size++] = pregunta;
        } else {
            System.out.println("No se puede añadir más preguntas");
        }
    }

    public void eliminar(int indice) {
        if (indice >= 0 && indice < size) {
            for (int i = indice; i < size - 1; i++) {
                preguntas[i] = preguntas[i + 1];
            }
            preguntas[size - 1] = null;
            size--;
        } else {
            System.out.println("Índice no válido");
        }
    }
}
