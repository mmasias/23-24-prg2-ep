public class Main {
    public static void main(String[] args) {
        Profesor profesor=new Profesor("Manuel Masias", "666999XY");
        Asignatura asignatura=new Asignatura("Programación 2", "PRG2", 6);
        ProfesorVigilante profesorVigilante= new ProfesorVigilante("Loyda Alas", "433452A");
        Preguntas preguntas=new Preguntas("Vista Publica Clases", "VIsta publica delos objetos", "Vista privada de clases");
        Examen examen = new Examen(profesor,profesorVigilante, asignatura, "10:15", "12-03-2021", preguntas);
        profesor.mostrarProfesor();
        examen.enseñar();
        preguntas.mostrarPreguntas();
    }
}

