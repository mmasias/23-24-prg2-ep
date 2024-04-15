package ExamenParcial;

public class ExamenParcial {
    public static void main(String[] args) {
        // Crear un profesor
        Profesor profesor = new Profesor("Manuel Masias", 12345);
    
        // Crear una asignatura
        int horarioInicioAsignatura = 800; // Ejemplo de horario de 8:00 a 10:00
        int horarioFinAsignatura = 1000;
        Asignatura asignatura = new Asignatura("Programación 2", profesor);
    
        // Crear un vigilante
        Vigilante vigilante = new Vigilante("Vigilante Loyda", 54321);
    
        // Crear preguntas
        String[] preguntasArray = {
            "Vista Publica de Clases",
            "Vista Publica de Objetos",
            "Vista Privada"
        };
        Preguntas preguntas = new Preguntas(preguntasArray);
    
        // Crear un examen
        int horarioInicioExamen = 1030; // Ejemplo de horario de examen de 10:30 a 12:30
        int horarioFinExamen = 1230;
        Examen examen = new Examen("15/04/2024", horarioInicioExamen, horarioFinExamen, vigilante, asignatura, preguntas, 80, "Estudiante A");
    
        // Mostrar los detalles del examen
        System.out.println("Detalles del Examen:");
        System.out.println("Fecha: " + examen.getFecha());
        System.out.println("Vigilante: " + examen.getVigilante().getNombre());
        System.out.println("Asignatura: " + examen.getAsignatura().getApodo());
        System.out.println("Profesor: " + examen.getAsignatura().getProfesor().getNombre());
        System.out.println("Preguntas: " + examen.getPreguntas().getNumeroPreguntas());
        System.out.println("Puntaje: " + examen.getPuntuaje());
        System.out.println("Estudiante: " + examen.getEstudiante());
    }
    
}