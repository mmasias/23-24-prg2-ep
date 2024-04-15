public class Examen{
    private String tipo;
    private Profesor profesor;
    public Examen(String tipo, Profesor profesor){
        this.tipo = tipo;
        this.profesor = profesor;
    }
    public void mostrarExamen(){
        System.out.println("Examen:" + tipo + " vigilado por profª " + profesor.mostrarProfesor());
    }
}