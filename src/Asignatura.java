public class Asignatura {
    private String nombre;
    private Examen examen;

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    private void asociarExamen(Examen examen) {
        this.examen = examen;
    }

    private void mostrarInformacionExamen() {
        if (examen != null) {
            System.out.println("Nombre del examen: " + examen.getTipoExamen());
            System.out.println("Preguntas del examen: ");
            System.out.println(examen.getPreguntasExamen());
            System.out.println("Duración del examen: " + examen.getDuracion() + " minutos");
        } else {
            System.out.println("No hay examen asociado a esta asignatura.");
        }
    }

    public void realizarExamen(Examen examen) {
        asociarExamen(examen);
        mostrarInformacionExamen();
    }
}
