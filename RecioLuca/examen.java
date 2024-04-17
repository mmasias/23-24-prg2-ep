package RecioLuca;

import java.util.Scanner;

class Profesor {
    private String nombreYApellido;
    private String NIE;

    public Profesor(String nombreYApellido, String NIE) {
        this.nombreYApellido = nombreYApellido;
        this.NIE = NIE;
    }

    public Profesor(String nombreYApellido, String DNI) {

    }

    public void mostrarProfesor() {

        System.out.println("Nombre del profesor: " + nombreYApellido + " - NIE " + NIE);

    }
}

class Asignatura {
    private String nombre;
    private String acortado;
    private int creditos;

    public Asignatura(String nombre, String acortado, int creditos) {
        this.nombre = nombre;
        this.acortado = acortado;
        this.creditos = creditos;
    }

    public void mostrarAsignatura() {
        System.out.println("Asignatura: + " + nombre + " - " + acortado + " - " + creditos + " creditos");
    }
}

class Examen {
    private String tipo;
    private String vigiladoPor;

    public Examen(String tipo, String vigiladoPor) {
        this.tipo = tipo;
        this.vigiladoPor = vigiladoPor;
    }

    public void mostrarExamen() {
        Scanner examen = new Scanner(System.in);
        System.out.println("¿Quieres que sea un examen parcial o final?");
        tipo = examen.nextLine();
        Scanner vigilar = new Scanner(System.in);
        System.out.println("¿Quien quieres que vigile el examen?");
        vigiladoPor = vigilar.nextLine();
        System.out.println("Examen: Examen " + tipo + " / Vigilado por Profª " + vigiladoPor);
    }
}

class Pregunta {
    private String pregunta;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void mostrarPregunta() {
        System.out.println("Pregunta: " + pregunta);
    }

}

public static void main(String[] args) {
    Profesor profesor = new Profesor("Manuel Masias", "666999XY");
    Profesor profesora = new Profesor("Loyda Alas", "433452A");
    profesor.mostrarProfesor();
    profesora.mostrarProfesor();
    Asignatura asignatura = new Asignatura("Programacion 2", "PRG2", 6);
    Examen examen = new Examen(null, null);
    examen.mostrarExamen();
    Pregunta pregunta1 = new Pregunta("Vista publica de clases");
    Pregunta pregunta2 = new Pregunta("Vista publica de objetos");
    Pregunta pregunta3 = new Pregunta("Vista privada de clases");
    pregunta1.mostrarPregunta();
    pregunta2.mostrarPregunta();
    pregunta3.mostrarPregunta();
}