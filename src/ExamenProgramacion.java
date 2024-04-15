public class ExamenProgramacion {
    public String nombreProfesor = "Manuel Masías";
    public String nieProfesor = "666999XY";
    public String Asignatura = "Programación 2";
    public int Creditos = 6;
    public String tipoExamen = "Examen Parcial";
    public String vigiladoPor = "Loyda Alas";
    public String dniVigilante = "433452A";
    public String Pregunta1 = "Vista pública clases";
    public String Pregunta2 = "Vista pública de objetos";
    public String Pregunta3 = "Vista privada de objetos";

    private String nombreProfesor;
    private String nieProfesor;
    private String dniVigilante;
    private String Asignatura;
    private int Creditos;
    private String tipoExamen;
    private String vigiladoPor;
    private String Pregunta1;
    private String Pregunta2;
    private String Pregunta3;

    public ExamenProgramacion(){}

    public String getnombreProfesor(){
        return nombreProfesor;
    }
    public String getnieProfesor(){
        return nieProfesor;
    }
    public String getdniVigilante(){
        return dniVigilante;
    }
    public String getAsignatura(){
        return Asignatura;
    }
    public int getCreditos(){
        return Creditos;
    }
    public String getTipoExamen(){
        return tipoExamen;
    }
    public String getvigiladoPor(){
        return vigiladoPor;
    }
    public String getPregunta1(){
        return Pregunta1;
    }
    public String getPregunta2(){
        return Pregunta2;
    }
    public String getPregunta3(){
        return Pregunta3;
    }

    public static void main(String[] args) {
        
      
        nombreProfesor nombreProfesor = new nombreProfesor("Manuel Masías");
        Asignatura asignatura = new Asignatura ("Programación 2");
        Vigilante vigilante = new vigilante ("Loyda Alas");
        nieProfesor nieProfesor = new nieProfesor ("666999XY");
        dniVigilante dniVigilante = new dniVigilante ("433452A");
        tipoExamen tipoExamen = new tipoExamen ("Examen parcial");
        Pregunta1 pregunta1 = new Pregunta1 ("Vista pública clases");
        Pregunta2 pregunta2 = new Pregunta2 ("Vista pública de objetos");
        Pregunta3 pregunta3 = new Pregunta3 ("Vista privada de clases");
    }
}
