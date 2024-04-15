 public class Asignatura {
    private String nombreAsignatura;
    private String idAsignatura;
    private int creditosAsignatura;

    Asignatura(String NombredeAsignatura, String idAsignatura, int creditosAsignatura){
        
        this.idAsignatura= idAsignatura;
        this.creditosAsignatura = creditosAsignatura;
        this.nombreAsignatura = NombredeAsignatura;


    }
    
    Asignatura(String NombredeAsignatura,  int creditosAsignatura){
        
        this.creditosAsignatura = creditosAsignatura;
        this.nombreAsignatura = NombredeAsignatura;


    }
    public void modificarNombre(String nombre) {
        this.nombreAsignatura = nombre;
    }

    public void modificarId(String idAsignatura) {
        this.idAsignatura= idAsignatura;
    }

    public void modificarCreditos(int creditos) {
        this.creditosAsignatura= creditos;
    }
}
