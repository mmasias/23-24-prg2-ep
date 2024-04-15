public class Main {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("Programacion 2");
        Profesor profesor = new Profesor("Manuel Masias", "Loyda Alas", 433452);
        Examen examen = new Examen("Examen Parcial", 
                                    "Pregunta 1: Vista pública clases - Diseño\n" +
                                    "Pregunta 2: Vista pública de objetos - Diseño de la conversación\n" +
                                    "Pregunta 3: Vista privada de clases - Codificación", 
                                    90);
        asignatura.realizarExamen(examen);
    }
}
