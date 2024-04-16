public class Examen {
    private String tipo;
    private Profesor profVigilante;
    private int nPreguntas;

    private String[] preguntas;

    public Examen(String tipo, Profesor profVigilante, int nPreguntas) {
        this.nPreguntas = nPreguntas;
        this.profVigilante = profVigilante;
        this.tipo = tipo;
        preguntas = new String[nPreguntas];
    }

    public void addPregunta(String pregunta){
        for (int i = 0; i < nPreguntas; i++) {
            if (preguntas[i] == ""){
                preguntas[i] = pregunta;
            }
        }
    }
}
