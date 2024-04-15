public class Examen {

private String nombre;
private Profesor profesor;
private Asignatura asignatura;
private String horas;
private String aula;
private Preguntas preguntas;

    public Examen(String nombre, Profesor profesor, Asignatura asignatura, String horas, String aula, Preguntas preguntas) {
    this.nombre = nombre;
    this.profesor = profesor;
    this.asignatura = asignatura;
    this.horas = horas;
    this.aula = aula;
    this.preguntas = preguntas;
}




   




    public void mostrarExmamen(){
        asignatura.mostrarAsignatura();
        System.out.println("Examen:"+nombre+"/ Vigilado por Profª: "+profesor.mostrarProfesor()+ " - "+ "hora:"+ horas + " - "+"en el aula "+ aula+"\n"+preguntas.getPreguntas());
 
    }

    

    

    


}
