public class App {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura("programacion", "PRG-2", 6);
        Profesor manuel = new Profesor("Manuel Masias", "666999XY", programacion);
        Profesor loyda = new Profesor("Loyda Alas", "433452A");

        Examen parcialProgramacion = new Examen("Parcial", loyda, programacion, 3);
        parcialProgramacion.crearPregunta("Vista Pública de las clases");
        parcialProgramacion.crearPregunta("Vista Pública de los objetos");
        parcialProgramacion.crearPregunta("Vista Privada de clases");

        System.out.println(manuel.mostrar());
        System.out.println(parcialProgramacion.mostrar());
        System.out.println(parcialProgramacion.mostrarPreguntas());
        System.out.println(programacion.mostrar());
    }
    
}
