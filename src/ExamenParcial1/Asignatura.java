public class Asignatura{
    private String nombre;
    private int creditos;
    Profesor profesor;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public Asignatura(String nombre, int creditos, Profesor profesor) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
    }
    public Asignatura() {
        //TODO Auto-generated constructor stub
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }   
}