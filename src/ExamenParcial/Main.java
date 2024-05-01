public class Main {
    public static void main (String []args) {
        Profesor profesor1 = new Profesor ("Manuel", "Masias", "666999XY");
        Asignatura programacion = new Asignatura("Programacion 2", "PRG2", 6);
        Examen examenParcial = new Examen("Parcial", new Pregunta ("Vista publica clases"), new Pregunta ( "Vista publica objetos"), new Pregunta("vista privada clases"), new Profesor("Loyda","Alas","433452A"));

        
        System.out.println(profesor1.mostrarProfesor());
        System.out.println(programacion.mostrarAsignatura());
        System.out.println(examenParcial.mostarExamen());


    }

}
