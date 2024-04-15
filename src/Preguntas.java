
public class Preguntas {
    private String asignatura1;
    private String asignatura2;
    private String asignatura3;
    public String getAsignatura1() {
        return asignatura1;
    }
    public void setAsignatura1(String asignatura1) {
        this.asignatura1 = asignatura1;
    }
    public String getAsignatura2() {
        return asignatura2;
    }
    public void setAsignatura2(String asignatura2) {
        this.asignatura2 = asignatura2;
    }
    public String getAsignatura3() {
        return asignatura3;
    }
    public void setAsignatura3(String asignatura3) {
        this.asignatura3 = asignatura3;
        
    }
    public Preguntas(String asignatura1, String asignatura2, String asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }
    public Preguntas() {
        //TODO Auto-generated constructor stub
    }
    public String mostrarPreguntas(){
        return "Pregunta 1: ´´" + asignatura1 + "´´" + "\n" + "Pregunta 2: ´´" + asignatura2 + "´´" + "\n"+ "Pregunta 3: ´´" + asignatura3 + "´´";
    }
}
