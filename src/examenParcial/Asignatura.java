package examenParcial;

public class Asignatura {

    private String name;
    private Profesor profesor;
    private int creditos;

    public Asignatura(String name, Profesor profesor) {
        this.name = name;
        this.profesor = profesor;
    }

    public Asignatura(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public Profesor profesor() {
        return profesor;
    }

    public int creditos() {
        return creditos;
    }

    public void establecerCreditos(int creditos) {
        this.creditos = creditos;
    }

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Manuel Masias", "666999XY");
        Asignatura asignatura = new Asignatura("Progra 2", profesor);

        System.out.println("Nombre de la asignatura: " + asignatura.name());

        if (asignatura.profesor() != null) {
            System.out.println("Profesor de la asignatura: " + asignatura.profesor().nombre());
        }

        asignatura.establecerCreditos(6);
        System.out.println("Créditos de la asignatura: " + asignatura.creditos());
    }
}
