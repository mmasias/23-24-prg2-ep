package examenParcial;

public class Profesor {

    private String name;
    private String dni;

    public Profesor(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public String nombre() {
        return name;
    }

    public String dni() {
        return dni;
    }

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Manuel Masias", "666999XY");
        System.out.println("Nombre del profesor: " + profesor.nombre());
        System.out.println("DNI del profesor: " + profesor.dni());
    }
}
