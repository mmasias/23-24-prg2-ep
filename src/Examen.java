public class Examen {
    private Profesor profesor;
    private Asignatura asignatura;
    private String hora;
    private String fecha;
    private Preguntas preguntas; 
    private ProfesorVigilante profesorVigilante;
    public Examen(){
    }
    public Examen(Profesor profesor,ProfesorVigilante profesorVigilante, Asignatura asignatura, String hora, String fecha, Preguntas preguntas){
        this.profesor=profesor;
        this.asignatura=asignatura;
        this.hora=hora;
        this.fecha=fecha;
        this.preguntas=preguntas;
        this.profesorVigilante=profesorVigilante;
    }
    public void modificar(){}
    public void enseñar(){
        
        System.out.println("Examen:"+"Vigilado por Profª "+profesorVigilante.mostrarProfesorVijilante());
    }
    public void corregirPreguntas(){}
}
