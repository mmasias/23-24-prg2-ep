import java.util.Scanner;

public class Profesor {
    String nombre;
    String ni;
    boolean extranjero;
    Asignatura asignatura;

    public Profesor(String nombre, String ni, boolean extranjero) {
        this.nombre = nombre;
        this.ni = ni;
        this.extranjero = extranjero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNi() {
        return ni;
    }

    public boolean getExtranjero() {
        return extranjero;
    }

    public void asociarAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
    }

    public Examen prepararExamen(int numDePreguntas, Profesor profesorVigilante){
        Examen ex = new Examen(numDePreguntas, profesorVigilante);

        //aca claramente me muerde el haber olvidado añadir un metodo que reciba las preguntas
        ex.preguntas[0]="Vista publica clases";
        ex.preguntas[1]="Vista publica objetos";
        ex.preguntas[2]="Vista privada clases";
        return ex;
    }

    public void impartirExamen(Examen examen){

        //hubiera ido bien un metodo imprimir para cada clase
        System.out.print("Nombre del profesor: "+nombre+" - ");
        if (extranjero){
            System.out.print("NIE ");
        } else {
            System.out.print("DNI ");
        }
        System.out.println(ni);

        System.out.println("  Asignatura: "+ asignatura.nombre+ " - "+ asignatura.id+ " - "+ asignatura.creditos+" creditos");
        System.out.print("      Examen / Vigilado por Prof. : " + examen.getVigilante().getNombre());
        if (examen.getVigilante().getExtranjero()){
            System.out.print(" NIE ");
        } else {
            System.out.print(" DNI ");
        }
        System.out.println(examen.getVigilante().getNi());
        examen.imprimirPreguntas();
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }
}
