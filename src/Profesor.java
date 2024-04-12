public class Profesor {

    String nombre;
    Asignatura asignatura;
    String nie;
    String dni;

    public Profesor(String nombre, Asignatura asignatura, String nie){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.nie = nie;
    }

    public Profesor(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public void verProfesor(){
        System.out.println("]> Nombre: " + nombre);
        System.out.println("]> NIE: " + nie);
        System.out.println("]> DNI: " + dni);
        if (asignatura != null) {
            asignatura.mostrarAsignatura();
        }
    }


    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("Programacion 2", 6, "PRG2");
        Profesor profesor = new Profesor("Manuel Masias", asignatura, "12345678A");
        Profesor profesorVigila = new Profesor("Loyda Alas", "y12684678A");
        Examen examen = new Examen("Vista publica de clases", "Vista publica de objetos", "Vista privada de clases");
        
        System.out.println("Profesor: ");
        profesor.verProfesor();
        System.out.println("Profesor Vigilante: ");
        profesorVigila.verProfesor();
        System.out.println("Examen: Examen Parcial de Programacion 2");
        examen.verPreguntas();
    }
    
}
