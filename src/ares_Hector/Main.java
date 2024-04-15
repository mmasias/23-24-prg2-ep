public class Main{
public static void main(String[]args){

 Profesor prof1=new Profesor("Manuel Masias", "NIE-666999XY");
    Asignatura asig1=new Asignatura("Programacion 2", "PRG 2", 6, prof1);
    Profesor prof2= new Profesor("Loyda Alas", "DNI-433452A");
    Preguntas preg1= new Preguntas("Pregunta 1: haz la vista publica de las clases\nPregunta 2: Haz la vista publica de los objetos\nPregunta 3:Vista privada de clase y objetos ");
    Examen examen= new Examen("Examen Parcial",prof2,asig1,"10:00","0.6",preg1);
examen.mostrarExmamen();
}

 }


   
