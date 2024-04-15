public class Profesor {
    private String nombre;
    private String documentoIdentidad;
    public Profesor(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }
    public String mostrarProfesor(){
        return "Nombre del profesor:"+nombre +" - "+ documentoIdentidad;
         }
    
         
          }
