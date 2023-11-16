package Dominio;

import java.io.Serializable;


public class Tematica implements Serializable {
    private String nombre;    
    private String descripcion;

    public Tematica(String nombre,String descripcion){
        this.nombre = nombre;
        this.descripcion=descripcion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o){
        Tematica t=(Tematica) o;
        return this.getNombre().equals(t.getNombre());
    }

    
    @Override
    public String toString(){

        return nombre;
    }
    
}
