public class Profesor {

    private String nombre;
    private String nie;

    public Profesor(String nombre, String nie) {
        this.nombre = nombre;
        this.nie = nie;
    }

    public Profesor(Profesor profesor) {
        this(profesor.nombre, profesor.nie);
    }

    public String mostrar() {
        return "Nombre del profesor: " + nombre + "-" + "NIE " + nie;
    }

    public static void main(String[] args) {

        Profesor profesor;
        profesor = new Profesor("Manuel Masías", "666999XY");
        System.out.println(profesor.mostrar());

    }

}


