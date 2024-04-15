public class Examen {

    String TipoExamen;
    String Subtituto;
    String DNI;
    String Pregunta1;
    String Pregunta2;
    String Pregunta3;

    Examen(String TipoExamen, String Subtituto, String DNI, String Pregunta1, String Pregunta2, String Pregunta3){

        this.TipoExamen=TipoExamen;
        this.Subtituto=Subtituto;
        this.DNI=DNI;
        this.Pregunta1=Pregunta1;
        this.Pregunta2=Pregunta2;
        this.Pregunta3=Pregunta3;

    }

    public static void main(String[] args) {

        Examen examen = new Examen("Examen final", "Pablo Herrero", "54321Z", "Resuelva esta ecuacion", "Resuelva estas 2 derivadas", "Hallar la ecuacion de esta grafica");

    }

}
