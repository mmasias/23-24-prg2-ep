import java.util.ArrayList;

    class Profesor {
        private String nombreProfesor;
        private String supervisorExamen;

        public Profesor (String nombreProfesor, String supervisorExamen){
            this.nombreProfesor = nombreProfesor;
            this.supervisorExamen = supervisorExamen;
        }
    }
    
    class Asignatura {
        private String nombreAsignatura;
        private int creditos;
        private String id;

        public Asignatura (String nombre, int creditos, String id){
            this.nombreAsignatura = nombre;
            this.creditos = creditos;
            this.id = id;
        }
    }
    
    class Examen {
        private String nombreExamen;
        private ArrayList <String> preguntas;
        private Profesor supervisorExamen;
        

        public Examen (String nombreExamen, Profesor supervisorExamen){
            this.nombreExamen = nombreExamen;
            this.preguntas = new ArrayList<>();
            this.supervisorExamen = supervisorExamen;
        }

        public Profesor getsupervisorExamen (){
            return supervisorExamen;
        }

        public String getnombreExamen (){
            return nombreExamen;
        }


    }

     class Main {
        public static void main(String[] args) {
            Asignatura progra2 = new Asignatura("Programacion 2", 6, "PRG2");
        
            Profesor manuel = new Profesor("Manuel Masias", null);
            Examen examen = new Examen("Parcial", manuel);
        
            System.out.println("Nombre del profesor: " );
            System.out.println("Exámen: Exámen " + examen.getnombreExamen() + " / Vigilado por Prof.: ");
    }
}