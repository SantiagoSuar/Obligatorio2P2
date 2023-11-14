package Dominio;

public class Evaluador extends Persona {

    private int añoIngreso;

    public Evaluador(String nombre, String direccion, int cedula, int añoIngreso) {
        super(nombre, direccion, cedula);
        this.añoIngreso = añoIngreso;

    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

}
