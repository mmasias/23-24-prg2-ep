import java.util.*;

public class ExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del profesor:");
        String nombreProfesor = scanner.nextLine();

        Profesor profesor1 = new Profesor(nombreProfesor, "dniNie");
        Asignatura asignatura = new Asignatura("nombreA", profesor1);
        List<String> preguntas = Arrays.asList("pregunta1", "pregunta2", "pregunta3");

        System.out.println("Ingrese el nombre del segundo profesor:");
        String nombreSegundoProfesor = scanner.nextLine();
        Profesor profesor2 = new Profesor(nombreSegundoProfesor, "dniNie");

        Examen examen = new Examen(preguntas, profesor2);
        scanner.close();
    }

    static class Profesor {
        private String nombreP;
        private String dniNie;

        public Profesor(String nombreP, String dniNie) {
            this.nombreP = nombreP;
            this.dniNie = dniNie;
        }

        public String getNombreP() {
            return nombreP;
        }

        public String getDniNie() {
            return dniNie;
        }
    }

    static class Asignatura {
        private String nombreA;
        private Profesor profesor;

        public Asignatura(String nombreA, Profesor profesor) {
            this.nombreA = nombreA;
            this.profesor = profesor;
        }

        public String getNombreA() {
            return nombreA;
        }
    }

    static class Examen {
        private List<String> preguntas;
        private Profesor vigilante;

        public Examen(List<String> preguntas, Profesor vigilante) {
            this.preguntas = preguntas;
            this.vigilante = vigilante;
        }

        public List<String> getPreguntas() {
            return preguntas;
        }

        public String getVigilante() {
            return vigilante.getNombreP() + " - " + vigilante.getDniNie();
        }
    }
}