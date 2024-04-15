public class Examen {
    private Profesor profesor;
    private Asignatura asignatura;
    private Preguntas preguntas;
    private String aula;
    private String dia;
    private String hora;
    
    public Examen(Profesor profesor, Asignatura asignatura, Preguntas preguntas, String aula, String dia) {
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.preguntas = preguntas;
        this.aula = aula;
        this.dia = dia;
        
    }


    public void mostrarInformacion(){
        asignatura.mostrarAsignatura();
    System.out.println("Examen:"+"Vigilado por Profª "+profesor.mostrarProfesor()+" - "+dia+" - "+hora+"\n"+preguntas.getPreguntas());

    }
}
