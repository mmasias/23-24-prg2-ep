public class Preguntas {
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
    public Preguntas(){
    }

    public Preguntas(String pregunta1, String pregunta2, String pregunta3) {
        this.pregunta1=pregunta1;
        this.pregunta2=pregunta2;
        this.pregunta3=pregunta3;
 
    }
    public void mostrarPreguntas(){
System.out.println(pregunta1+"\n"+pregunta2+"\n"+pregunta3);


    }
}
