public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Manuel Masias", "666999XY");
        Asignatura asignatura = new Asignatura("Programación 2", "PRG2", 6);
        Examen examen = new Examen("Examen Parcial");
        ProfesorSupervisor supervisor = new ProfesorSupervisor("Loyda Alas", "433452A");
        PrimeraPregunta pregunta1 = new PrimeraPregunta("Vista pública clases");
        SegundaPregunta pregunta2 = new SegundaPregunta("Vista pública de objetos");
        TerceraPregunta pregunta3 = new TerceraPregunta("Vista privada de clases");

        System.out.println("-".repeat(80));
        System.out.println("Nombre del profesor: " + profesor.catedratico + " - NIE " + profesor.id);
        System.out.println("    Asignatura: " + asignatura.materia + " - " + asignatura.abreviatura + " - "
                + asignatura.creditos + " créditos");
        System.out.println("        Examen: " + examen.ingresarExamen
                + (" / Vigilado por Profª.: " + supervisor.supervisor + " - DNI " + supervisor.identificacion));
        System.out.println("            Pregunta 1: \"" + pregunta1.PrimeraPregunta + "\"");
        System.out.println("            Pregunta 2: \"" + pregunta2.SegundaPregunta + "\"");
        System.out.println("            Pregunta 3: \"" + pregunta3.TerceraPregunta + "\"");
        System.out.println("-".repeat(80));
    }
}
