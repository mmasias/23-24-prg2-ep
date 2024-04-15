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
        Examen[] examenesNuevo = new Examen[examenes.length + 1];
        for(int numero = 0; numero < examenes.length; numero++){
            examenesNuevo[numero] = examenes[numero];
        }
        examenesNuevo[examenes.length] = examen;
        examenes = examenesNuevo;
    }

    public String mostrar(){
        String salida = "Nombre del profesor: " + profesor.mostrar();
        salida += "\n   Asignatura: " + nombre + " - " + codigo + " - " + creditos + " creditos";
        for (Examen examen : examenes) {
        salida += "\n     " + examen.mostrar();
        }
        return salida;
    }
}
