package examenParcial;

public class Main {
    public static void main(String[] args) {
        
        Profesor profesor = new Profesor("Manuel","Masias", "NIE 666999XY", "");
        Profesor profesorVigilante = new Profesor("Loyda", "Alas", "",  "DNI 433452A");
        
        Asignatura asignatura = new Asignatura("Programacion 2", "PRG2", 6);
        
        Pregunta preguntas = new Pregunta("Vista publica clases","Vista pública de objetos", "Vista privada de clases");
        
        Examen examen = new Examen("Examen Parcial", profesorVigilante,preguntas);
        
        System.out.println(profesor.mostrarProfesor());
        System.out.println(asignatura.mostrarAsignatura());
        System.out.println(examen.mostrarExamen());

    }
}
