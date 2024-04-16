class Examen{

    private String tipoExamen;
    private String profesorVigilante;
    private String dni;
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
    private String pregunta4;

    public Examen (String tipoExamen, String profesorVigilante, String dni){
        this.tipoExamen = tipoExamen;
        this.profesorVigilante = profesorVigilante;
        this.dni = dni;
    }

    public Examen (String pregunta1, String pregunta2, String pregunta3, String pregunta4){
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.pregunta4 = pregunta4;
    }
    
    public void mostrar(){
        System.out.println("Examen: " + tipoExamen + "/" + "Vigilado por: " + profesorVigilante + "/" + "DNI: " + dni);
        System.out.println("Primera pregunta: " + pregunta1);
        System.out.println("Segunda pregunta: " + pregunta2);
        System.out.println("Tercera pregunta: " + pregunta3);
        System.out.println("Cuarta pregunta: " + pregunta4);
    }

    public static void main(String[] args) {

        Examen examen;
        examen = new Examen(" Examen Parcial", "Loyda Alas", "433452A");
        System.out.println(examen.mostrar());

        Examen examen;
        examen = new Examen ("Vista pública clases", "Vista pública objetos", "Vista privada clases", "Vista privada objetos");
        System.out.println(examen.mostrar());
    }

}

