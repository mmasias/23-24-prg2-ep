package puenteDaniel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examen {
    private List<Pregunta> preguntas;
    private List<Profesor> profesores;

    public Examen() {
        preguntas = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void addPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarVigilante(Vigilante vigilante) {
        System.out.println("Vigilante " + vigilante.getNombre() + " agregado al examen");
    }

    public void agregarAsignatura(Asignatura asignatura) {
        System.out.println("Asignatura " + asignatura.getNombre() + " agregada al examen");
    }

    public void realizarExamen() {
        Scanner scanner = new Scanner(System.in);
        for (Profesor profesor : profesores) {
            System.out.println("Examen del profesor: " + profesor.getNombre());
            for (Pregunta pregunta : preguntas) {
                System.out.println(pregunta.getEnunciado());
                String respuesta = scanner.nextLine();
        }
        scanner.close();
        }
    }
}
