public class Indicaciones {
    private String reglas;
    private String enunciado;

    Indicaciones(String enunciado, String reglas){
    this.reglas= reglas;
    this.enunciado=enunciado;
    }
    
    Public String modificarReglas(String reglas){
    this.reglas= reglas;
    }
    
    Public String modificarEnunciado(String enunciado){
    this.enunciado= enunciado;
        }
    
}
