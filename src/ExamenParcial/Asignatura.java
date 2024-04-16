public class Asignatura {
    private String nombre;
    private String codigo;
    private int creditos;


    public Asignatura(String nombre, String codigo, int creditos){
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }
    

    public Asignatura(String nombre2, String codigo2, String string) {
        //TODO Auto-generated constructor stub
    }


    public String mostrarAsignatura() {
        return "Asignatura: " + nombre + " - " + codigo + " " +  creditos + " créditos" ;
    }
}
