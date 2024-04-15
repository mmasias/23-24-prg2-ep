public class Main {
    public static void main(String[] args){

        Profesor manuel=new Profesor("Manuel Masias", "666999XY");
        Asignatura programacion2= new Asignatura("Porgramacion 2", "Prg2",6);
        
        manuel.establecerAsignatura(programacion2);
        
        Examen parcial = new Examen("Examen Parcial");
        Profesor loyda = new Profesor("Loyda alas", "433452A");
        
        parcial.establecerProfesor(loyda);
        manuel.obtenerAsignatura().establecerExamen(parcial);
        
        System.out.println(manuel.mostrarDatos());
        System.out.println(manuel.obtenerAsignatura().mostarDatos());
        System.out.println(manuel.obtenerAsignatura().obtenerExamen().mostrarDatos());
      }

    }
}
