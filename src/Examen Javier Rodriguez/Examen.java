public class Examen {

    private String tipoExamen;
    private String nombreVigilante;
    private String apellidoVigilante;
    private String dni;
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;

    public Examen(String tipoExamen, String nombreVigilante, String apellidoVigilante, String dni, String pregunta1,
            String pregunta2, String pregunta3) {
        this.tipoExamen = tipoExamen;
        this.nombreVigilante = nombreVigilante;
        this.apellidoVigilante = apellidoVigilante;
        this.dni = dni;
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
    }

    public void mostrarExamen() {
        System.out.println("Examen: " + tipoExamen + " / Vigilado por Profª: " + nombreVigilante + " " + apellidoVigilante + " - DNI: "+ dni);
        System.out.println("Pregunta1: " + pregunta1);
        System.out.println("Pregunta2: " + pregunta2);
        System.out.println("Pregunta3: " + pregunta3);
    }
}
