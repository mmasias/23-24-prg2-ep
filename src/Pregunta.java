public class Pregunta {

    private int numeroPregunta;
    private String enunciado;
    
    public Pregunta(int numeroPregunta, String enunciado){
        this.numeroPregunta = numeroPregunta;
        this.enunciado = enunciado;
    }

    public String mostrar(){
        return "Pregunta " + numeroPregunta + ": " + enunciado;
    }
    
}