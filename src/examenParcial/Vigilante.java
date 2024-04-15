package examenParcial;

public class Vigilante {

    private String name;
    private String dni;

    public Vigilante(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public String name() {
        return name;
    }

    public String dni() {
        return dni;
    }

    public static void main(String[] args) {
        Vigilante vigilante = new Vigilante("Loyda Alas", "433452A");
        System.out.println("Nombre del vigilante: " + vigilante.name());
        System.out.println("DNI del vigilante: " + vigilante.dni());
    }
}
