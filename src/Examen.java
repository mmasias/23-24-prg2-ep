public class Examen {
    private String nombre;
    private String dni;
    private String introduccionExamen;

    public Examen() {
        this.nombre = "";
        this.dni = "";
        this.introduccionExamen = "";
    }

    public Examen(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.introduccionExamen = "";
    }

    public Examen(String introduccionExamen,String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.introduccionExamen = introduccionExamen;
    }

    public void verificar() {
        if (dni == null || dni.isEmpty() || dni.length() != 9) {
            System.out.println("DNI inválido, debe tener 9 caracteres.");
        } else if (nombre == null || nombre.isEmpty()) {
            System.out.println("Nombre inválido, no puede estar vacío.");
        } else {
            System.out.println("Examen válido para el estudiante: " + nombre);
        }
    }
}
