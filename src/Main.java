//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Profesor profesor = new Profesor("Manuel Masias", "666999xy", true);
        profesor.asociarAsignatura(new Asignatura("Programacion 2", "PRG2", 6));
        profesor.impartirExamen(profesor.prepararExamen(3, new Profesor("Loyda Alas", "433452A", false)));
    }
}