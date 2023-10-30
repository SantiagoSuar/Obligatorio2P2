package Dominio;

public class Persona {
    private String nombre;    
    private String direccion;
    private String cedula;

    public Persona(String nombre, String direccion, String cedula){
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public boolean equals(Object o){
        Persona p=(Persona) o;
        return this.getCedula().equals(p.getCedula());
    }
}
