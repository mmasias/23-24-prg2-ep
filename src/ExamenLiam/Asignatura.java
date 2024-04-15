public class Asignatura{
private String nombre;
private String codigo;
private int creditos;
private Profesor profesor;
public Asignatura(String nombre, String codigo, int creditos, Profesor profesor) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.creditos = creditos;
    this.profesor = profesor;
}

public void mostrarAsignatura(){
    System.out.println(profesor.mostrarProfesor());

    System.out.println("Asignatura: "+nombre+"-" +codigo+" - "+creditos+" creditos");
}


}