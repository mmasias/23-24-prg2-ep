public class Profesor {

    String Nombre;
    String Apellido;
    String NIE;

    Profesor(String Nombre, String Apellido, String NIE){

        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.NIE=NIE;
    }

    public static void main(String[] args) {

        Profesor profesor = new Profesor("Jorge", "Crespo", "12345B");

    }
}
