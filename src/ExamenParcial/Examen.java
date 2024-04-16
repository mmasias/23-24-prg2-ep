public class Examen {
    private String nombre;
    private Pregunta pregunta1;
    private Pregunta pregunta2;
    private Pregunta pregunta3;
    private Profesor profesorVigilante;

    
    public Examen(String nombre, Pregunta pregunta1, Pregunta pregunta2, Pregunta pregunta3, Profesor profesorVigilante){
        this.nombre = nombre;
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.profesorVigilante = profesorVigilante;
    }

    public String mostarExamen() {
        return "Examen: " + nombre + " / Profesor Vigilante: " + profesorVigilante.mostrarProfesor() 
        + "\n" + "Pregunta 1: " + pregunta1 + "\n" + "Pregunta 2: " + pregunta2 + "\n" + "Pregunta 3: " + pregunta3;
    }
}
