
public class Main {

  public static void main(String[] args) {
    Profesor manuel = new Profesor("Manuel Masias", "666999XY");
    Asignatura programacion = new Asignatura("Programacion 2", "PRG2", 6);
    manuel.establecerAsignatura(programacion);
    Examen parcial = new Examen("Examen Parcial");
    Profesor loyda = new Profesor("Loyda alas", "433452A");
    parcial.establecerProfesor(loyda);
    parcial.añadirPregunta("Vista publica de clases");
    parcial.añadirPregunta("Vista publica de objetos");
    parcial.añadirPregunta("Vista privada de clases");
    manuel.obtenerAsignatura().establecerExamen(parcial);
    System.out.println(manuel.mostrarDatos());
    System.out.println(manuel.obtenerAsignatura().mostarDatos());
    System.out.println(manuel.obtenerAsignatura().obtenerExamen().mostrarDatos());
  }
}
