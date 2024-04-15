package examenParcialManuelaGrizoni;

public class Profesor {
    private String nombre; 
    private String DNI;
    private Asignatura asignatura;

    public Profesor(String nombre, String DNI, Asignatura asignatura){
        this.nombre = nombre;
        this.DNI = DNI;
        this.asignatura = asignatura;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDNI(){
        return DNI;
    }

    public Asignatura getAsignatura(){
        return asignatura;
    }
}

public class Asignatura {
    private String nombre;

    public Asignatura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}

public class Examen {
    private String nombre;
    private Profesor vigilante;
    private Pregunta[] preguntas;

    public Examen(String nombre, Profesor vigilante, Pregunta[] preguntas){
        this.nombre = nombre;
        this.vigilante = vigilante;
        this.preguntas = preguntas;
    }

    public String getNombre(){
        return nombre;
    }

    public Profesor getVigilante(){
        return vigilante;
    }

    public Pregunta[] getPreguntas(){
        return preguntas;
    }
}

public class Pregunta {
    private String enunciado;

    public Pregunta(String enunciado){
        this.enunciado = enunciado;
    }

    public String getEnunciado(){
        return enunciado;
    }
}

Profesor profesor = new Profesor("Manuel Masias", "DNI del profesor", new Asignatura("Programacion 2"));

Pregunta[] preguntas = {
    new Pregunta("Vista pública clases - Diseño"),
    new Pregunta("Vista pública de objetos - Diseño de la conversación"),
    new Pregunta("Vista privada de clases - Codificación")
};
Profesor vigilante = new Profesor("Loyda Alas", "433452A", null); 

profesor.prepararExamen("Examen Parcial", vigilante, preguntas);

profesor.getAsignatura(); 



