public class Asignatura{
    private String nombre;
    private String codigo;
    private int creditos;
    public Asignatura(String nombre, String codigo, int creditos){
        this.nombre=nombre;
        this.codigo=codigo;
        this.creditos=creditos;

    }
    public Asignatura(String nombre, int creditos){
        this.nombre=nombre;
        this.creditos=creditos;
    }
    public void mostrarAsignatura(){
        
    
        System.out.println("Asignatura: "+nombre+"-" +codigo+" - "+creditos+" creditos");
    }
} 