public class Asignatura {
    private String nombre;
    private String codigo;
    private int credits;

    public Asignatura(String nombre, String codigo, int credits) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.credits = credits;
    }


    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.codigo = ""; 
        this.credits = 0; 
    }
    public String getName() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getCredits() {
        return credits;
    }
}
