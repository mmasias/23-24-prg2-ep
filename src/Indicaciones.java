public class Indicaciones {
   private String reglas;
   private String enunciado;

   public Indicaciones(String enunciado, String reglas) {
       this.reglas = reglas;
       this.enunciado = enunciado;
   }

   public void modificarReglas(String reglas) {
       this.reglas = reglas;
   }

   public void modificarEnunciado(String enunciado) {
       this.enunciado = enunciado;
   }

   public String obtenerReglas() {
       return this.reglas;
   }

   public String obtenerEnunciado() {
       return this.enunciado;
   }
}