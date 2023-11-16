package Dominio;

import java.io.Serializable;

public class Evaluador extends Persona implements Serializable{

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
