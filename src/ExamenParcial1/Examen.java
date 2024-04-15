public class Examen {
    private String nombre;
    private Preguntas preguntas;
    private ProfesorVigilante profeVigilante;;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Examen(String nombre, Preguntas preguntas, ProfesorVigilante profeVigilante) {
        this.nombre = nombre;
        this.preguntas = preguntas;
        this.profeVigilante = profeVigilante;
    }

    public Examen() {
    }

    public Examen(String string, Preguntas p) {
        //TODO Auto-generated constructor stub
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas preguntas) {
        this.preguntas = preguntas;
    }

    public ProfesorVigilante getProfeVigilante() {
        return profeVigilante;
    }

    public void setProfeVigilante(ProfesorVigilante profeVigilante) {
        this.profeVigilante = profeVigilante;
    }

    public String mostrarExamen(){
    return "Examen: " + getNombre() + " / Vigilado por Profª.: " + profeVigilante.getNombre() 
    + " - DNI " + profeVigilante.getDni() + "\n" + preguntas.mostrarPreguntas();
    }
    
}