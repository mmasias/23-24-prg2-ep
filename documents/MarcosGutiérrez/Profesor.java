public class Profesor {

    String nombre = "";
    String dni = "";
    Asignatura asignatura;

    public Profesor(String nombre, String dni, Asignatura asignatura){
        this.nombre = nombre;
        this.dni = dni;
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String mostrar(){
        String mostrar = "";
        mostrar += nombre + " - DNI " + dni; 
        return mostrar;
    }
    
}
