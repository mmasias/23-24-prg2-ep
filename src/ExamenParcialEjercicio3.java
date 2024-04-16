public class ExamenParcialEjercicio3 {
    public static void main(String[] args) {
        Profesor profesorEncargado = new Profesor("Manuel Masias");
        Asignatura asignatura = new Asignatura("Programación2", profesorEncargado);
        Examen examen = new Examen("Examen Parcial");
        Pregunta pregunta1 = new Pregunta("Vista pública de clases");
        Pregunta pregunta2 = new Pregunta("Vista publica de objetos");
        Pregunta pregunta3 = new Pregunta("Vista privada de clases");
        
        System.out.println("Profesor encargado: " + profesorEncargado.getNombre());
        System.out.println("Asignatura: " + asignatura.getNombre());
        System.out.println("Tipo de examen: " + examen.getTipo() + "/ Vigilado por Profª.: Loyda Alas" );
        
        examen.agregarPregunta(pregunta1);
        examen.agregarPregunta(pregunta2);
        examen.agregarPregunta(pregunta3);
    }
}

class Profesor {
    private String nombre;
    
    public Profesor(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}

class Asignatura {
    private String nombre;
    private Profesor profesorEncargado;
    
    public Asignatura(String nombre, Profesor profesorEncargado) {
        this.nombre = nombre;
        this.profesorEncargado = profesorEncargado;
    }
    
    public String getNombre() {
        return nombre;
    }

}

class Examen {
    private String tipo;
    
    public Examen(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void agregarPregunta(Pregunta pregunta) {
        System.out.println("Pregunta: " + pregunta.getEnunciado());
    }
}

class Pregunta {
    private String enunciado;
    
    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
}

