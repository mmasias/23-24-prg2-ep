public class Asignatura{
    private String name;
    private int creditos;
    Profesor profesor;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Asignatura(String name, int creditos, Profesor profesor) {
        this.name = name;
        this.creditos = creditos;
        this.profesor = profesor;
    }
    public Asignatura() {
        
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }   
}