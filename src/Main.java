public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Manuel Masias", "666999XY");

        Asignatura asignatura = new Asignatura("Programación 2", 6, profesor);


        Preguntas p = new Preguntas();
        p.setAsignatura1("Vista pública de clases");
        p.setAsignatura2("Vista pública de objetos");
        p.setAsignatura3("Vista privada de clases");

        Examen examen = new Examen("Examen Parcial", p, new ProfesorVigilante("Loyda Alas", "433452A"));
        System.out.println("Nombre del profesor: " + asignatura.getProfesor().getNombre() + " - NIE " + asignatura.getProfesor().getDni());
        System.out.println("Asignatura: " + asignatura.getName() + " - PRG2 - " + asignatura.getCreditos() + " Creditos");
        System.out.println(examen.mostrarExamen());
    } 
}
