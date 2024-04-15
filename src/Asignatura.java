public class Asignatura {

    private String nombre;
    private Profesor profesor;
    private Examen[] examenes;
    private String codigo;
    private int creditos;

    public Asignatura(String nombre, Profesor profesor, Examen[] examenes, String codigo, int creditos){
        this.nombre = nombre;
        this.profesor = profesor;
        this.examenes = examenes;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public void anadirExamen(Examen examen){

    }

    public String mostrar(){
        return "Nombre de la asignatura[" + nombre + "] / profesor[" + profesor + "] / Examen[" + examenes +"] / Codigo[" + codigo + "] / Creditos[" + creditos + "]";
    }
}
