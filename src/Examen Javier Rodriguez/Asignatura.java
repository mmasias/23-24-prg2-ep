public class Asignatura {

    private String asignatura;
    private String siglas;
    private int creditos;
    private String aula;

    public Asignatura(String asignaturas, String siglas, int creditos, String aula) {
        this.asignatura = asignaturas;
        this.siglas = siglas;
        this.creditos = creditos;
        this.aula = aula;

    }

    public void mostrarAsignatura() {
        System.out.println(
                "Asignatura: " + asignatura + " - " + siglas + " - Creditos: " + creditos + " - Aula: " + aula);
    }
}
