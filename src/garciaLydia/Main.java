package src.garciaLydia;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Manuel Masias", "666999XY");
        Asignatura asignatura = new Asignatura("Programación", profesor, 6);
        Examen examen = new Examen(asignatura, "Loyda", "Inventa un código en java");

        System.out.println("Informacion del profesor: ");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("NIE: " + profesor.getNie());
        System.out.println("\nInformación de la asignatura: ");
        System.out.println("Nombre: " + asignatura.getNombre());
        System.out.println("Profesor: " + asignatura.getProfesor().getNombre());
        System.out.println("Creditos: " + asignatura.getCreditos());
        System.out.println("\nInformación del examen: ");
        System.out.println("Asignatura: " + examen.getAsignatura().getNombre());
        System.out.println("Profesor vigilante: " + examen.getProfesorVigilante());
        System.out.println("La pregunta del examen es: " + examen.getPreguntas());

    }
}

