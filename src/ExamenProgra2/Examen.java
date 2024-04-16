public class Examen {
    private String nombre;
    private Asignatura asignatura;
    private Profesor profesor;
    private Pregunta pregunta;
    
    public Examen(String nombre, Asignatura asignatura, Profesor profesor, Pregunta pregunta) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.pregunta = pregunta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public void mostrarExamen(){
        System.out.println("Nombre del profesor: " + asignatura.getProfesorEncargado().mostrarProfesor());
        System.out.println("Asignatura: "+ asignatura.getNombre()+ " - " + "PRG2"+ " - " +  asignatura.getCreditos() + " Creditos");
        System.out.println("Examen:" + this.getNombre()+ " / Vigilado por Profª.: "+ this.profesor.mostrarProfesor());
        System.out.println(this.pregunta.mostrarPreguntas());
    }
    
}
