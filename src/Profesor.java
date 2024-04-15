public class Profesor {
   
    private String nombre;
    private String apellido;
    private String idProfesor;
    
    public Profesor(String nombre, String apellido, String idProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idProfesor = idProfesor;
    }
    
    public Profesor(String nombre, String idProfesor) {
        this(nombre, "", idProfesor); 
    }
    
    public Profesor(String idProfesor) {
        this("", "", idProfesor); 
    }
    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void modificarApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void modificarId(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del profesor: " + nombre + " " + apellido + "Identificacion:"+ idProfesor);
    }
    
}
