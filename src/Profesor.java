
public class Profesor {

    private String name;
    private String dni;
    private String dniType;

    public String getNombre() {
        return name;
    }
    public void setNombre(String nombre) {
        this.name = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getdniType(){
        return dniType;
    }
    public void setdniType(String dniType){
        this.dniType= dniType;
    }
    public Profesor(String name, String dni, String dniType) {
        this.name = name;
        this.dni = dni;
        this.dniType = dniType;
    }
    public Profesor() {
    }

}

