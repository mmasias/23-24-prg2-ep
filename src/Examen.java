public class Examen {
    int numDePreguntas;
    Profesor profesorVigilante;

    String[] preguntas;

    public Examen(int numDePreguntas, Profesor profesorVigilante) {
        //hmm, faltaria tipo de examen
        this.numDePreguntas = numDePreguntas;
        this.profesorVigilante = profesorVigilante;
        this.preguntas = new String[numDePreguntas];
    }

    public Profesor getVigilante() {
        return profesorVigilante;
    }

    public void imprimirPreguntas(){
        for (int i = 1; i<=numDePreguntas;i++){
            System.out.println("            Pregunta "+i+": "+preguntas[i-1]);
        }
    }
}
