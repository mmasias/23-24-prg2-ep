package ExamenParcial;

public class Asignatura {
    private String apodo;
    private Profesor profesor;

    public Asignatura(String apodo, Profesor profesor) {
        this.apodo = apodo;
        this.profesor = profesor;
    }

    public String getApodo(){
        return apodo;

    }


    public int creditos() {
        return 6; 
    }

    public Temas temas() {
        return new Temas(5, "Temas de la asignatura"); 
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Examen examen() {
        return null; 
}
}
