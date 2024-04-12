public class Examen{
    
    String pregunta1;
    String pregunta2;
    String pregunta3;

    public Examen(String pregunta1, String pregunta2, String pregunta3){
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
    }

    public void verPreguntas(){
        System.out.println("Pregunta 1: " + pregunta1);
        System.out.println("Pregunta 2: " + pregunta2);
        System.out.println("Pregunta 3: " + pregunta3);
    }
}