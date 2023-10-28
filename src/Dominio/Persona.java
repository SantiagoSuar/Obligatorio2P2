package Dominio;

public class Persona {
    private String nombre;    
    private String direccion;
    private int cedula;

    public Persona(String nombre, String direccion, int cedula){
        this.nombre=nombre;
        this.direccion=direccion;
        this.cedula=cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
