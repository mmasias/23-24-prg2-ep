public class Asignatura {

    String Asignatura;
    String Codigo;
    int creditos;

    Asignatura(String Asignatura, String Codigo, int creditos){

        this.Asignatura=Asignatura;
        this.Codigo=Codigo;
        this.creditos=creditos;

    }

    public static void main(String[] args) {

        Asignatura asignatura = new Asignatura("Matematicas 2", "Mat2", 6);

    }

}
