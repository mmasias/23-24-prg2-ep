public class Asignatura{
    private String asignatura;
    private String código;
    private int créditos;
    public Asignatura(String asignatura, String código, int créditos){
        this.asignatura = asignatura;
        this.código = código;
        this.créditos = créditos;
    }
    public void mostrarAsignatura(){
        System.out.println("Asignatura: " + asignatura + " - " + código + " - " +créditos + "créditos");
        
    }
}