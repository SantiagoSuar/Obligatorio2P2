package Dominio;

import java.util.ArrayList;

public class Puesto {
    private ArrayList<Tematica> temasRequeridos;
    private String nombre;
    private int tipoPuesto;
    // int tipoPuesto PONDREMOS LAS OPCIONES DE PUESTO 1/2/3

   public Puesto(String nombre, int tipoPuesto, ArrayList<Tematica> temasRequeridos){

  this.nombre = nombre;
  
  this.tipoPuesto = tipoPuesto;

  this.temasRequeridos = new ArrayList<>(); 

}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipoPuesto
     */
    public int getTipoPuesto() {
        return tipoPuesto;
    }

    
    public void setTipoPuesto(int tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }

      @Override
    public String toString(){

        return nombre;
    }

    /**
     * @return the temasRequeridos
     */
    public ArrayList<Tematica> getTemasRequeridos() {
        return temasRequeridos;
    }

    
    public void setTemasRequeridos(ArrayList<Tematica> temasRequeridos) {
        this.temasRequeridos = temasRequeridos;
    }
   
    
}
