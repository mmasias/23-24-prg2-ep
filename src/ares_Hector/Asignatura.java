public class Asignatura {

    String nombreAsignatura;
    String codigo;
    int creditos;
    Profesor profesor;
    
    public Asignatura(String nombreAsignatura, String codigo, int creditos, Profesor profesor) {
        this.nombreAsignatura = nombreAsignatura;
        this.codigo = codigo;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void mostrarAsignatura(){
      System.out.println(profesor.mostrarProfesor());
        System.out.println("Asignatura:" + nombreAsignatura+"-"+codigo+"-"+creditos); 
    }
    
    
    
}
