public class Main{
    public static void main(String [ ] args ){
        Profesor profesor = new Profesor ("Manuel Masias", "666999XY");
        Asignatura asignatura = new Asignatura ("Programación 2", "PRG2", 6);
    
    
        Profesor profesor2 = new Profesor ("Loyda Alas", "433452A");
    
        Examen examen = new Examen ("Examen parcial", profesor2);
    
        Pregunta pregunta1 = new Pregunta ("Vista pública clases");
        Pregunta pregunta2 = new Pregunta ("Vista pública objetos");
        Pregunta pregunta3 = new Pregunta ("Vista privada clases");
   System.out.println(profesor.mostrarProfesor()); 
    asignatura.mostrarAsignatura();
    examen.mostrarExamen();
    pregunta1.mostrarPregunta();
    pregunta2.mostrarPregunta();
    pregunta3.mostrarPregunta();
    
    
    
    }
 }