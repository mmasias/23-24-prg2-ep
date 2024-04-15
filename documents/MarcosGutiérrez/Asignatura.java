public class Asignatura {
    String nombre = "";
    String codigo = "";
    int creditos = 0;

    public Asignatura (String nombre, String codigo, int creditos){
        this.nombre = nombre;
        this.codigo = codigo.toUpperCase();
        this.creditos = creditos;
    }

    public Asignatura (String nombre){
        this(nombre,nombre.substring(0, 4),6);
    }

    public String mostrar(){
        String informacion = "";
        informacion += "Nombre: " + nombre + " código: " + codigo + " creditos: " + creditos;
        return informacion;
    }
    
}
