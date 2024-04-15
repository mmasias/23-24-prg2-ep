public class ProfesorVigilancia{
    private String nombre;
    private String NIE;

    public ProfesorVigilancia(String nombre, String NIE) {
        this.nombre = nombre;
        this.NIE = NIE;
    }   
    public ProfesorVigilancia cambiarProfesorVigilancia(ProfesorVigilancia profesorVigilancia) {
        return profesorVigilancia;
    }
}
public static void main(String[] args) {
    ProfesorVigilancia profesorVigilancia = new ProfesorVigilancia("Loyda Alas", "433452A");    
}