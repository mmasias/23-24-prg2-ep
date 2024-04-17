public class Main{

    public static void main(String[] args){

        Profesor profesor = new Profesor("Manuel", "Masias", "666999XY");
        Asignatura asignatura = new Asignatura("Programacion", "PRG2", 6, "3B"); 
        Examen examen = new Examen("Parcial", "Loyda", "Alas", "433452A", "Vista publica de clases", "Vista publica de objetos", "Vista privada de clases");

        profesor.mostrarProfesor();
        asignatura.mostrarAsignatura();
        examen.mostrarExamen();

    }
}