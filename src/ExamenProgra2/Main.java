public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        profesor.setNombre("Manuel");
        profesor.setApellido("Masias");

        Asignatura asignatura = new Asignatura();
        asignatura.setNombre("Programacion 2");
        asignatura.setProfesorEncargado(profesor);
        asignatura.setCreditos(6);

        Pregunta p = new Pregunta();
       
        p.setPregunta1("Vista publica de clases");
        p.setPregunta2("Vista publica de objetos");
        p.setPregunta3("Vista privada de clases");

        Examen examen = new Examen("Examen parcial", asignatura, new Profesor("Loyda", "Alas"),p);
        examen.mostrarExamen();

    }

    
}
