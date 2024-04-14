package naranjoDylan;

public class examen {
    private String nameExamen;
    private asignatura asignatura;
    private profesores profesor;
    private String preguntas;

    public examen(String nameExamen, asignatura asignatura, profesores profesor, String preguntas) {
        this.nameExamen = nameExamen;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.preguntas = preguntas;
    }

    public void mostrarExamen() {
        profesor.mostrarProfesor();
        asignatura.mostrarasignaturas();
        System.out.println("Examen: " + nameExamen + " / Vigilado por Profᵃ.: Loyda Alas - DNI 433452A");
        System.out.println("Preguntas:");
        System.out.println(preguntas);
    }

    public static void main(String[] args) {
        profesores profesor = new profesores("Manuel Masias", "666999XY");
        asignatura asignatura = new asignatura("Programacion 2", "PRG2", 6);
        examen examen = new examen("Examen Parcial", asignatura, profesor,
                "1. Vista pública clases\n2. Vista pública de objetos\n3. Vista privada de clases & objetos");
        examen.mostrarExamen();
    }
}