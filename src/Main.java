public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Profesor manuel = new Profesor("Manuel Masías", "4334552A", "DNI");
        Profesor loyda = new Profesor("Loyda Alas", "666999XY", "NIE");

        Asignatura programacion2 = new Asignatura("Programación2", "PRG2", 6);
        Examen parcial = new Examen("Parcial", loyda,3);
        parcial.addPregunta("Vista pública de clases");
        parcial.addPregunta("Vista pública de objetos");
        parcial.addPregunta("Vista privada de clases");

        programacion2.addExamen(parcial);
        manuel.addAsignatura(programacion2);
    }
}