package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Postulante extends Persona implements Comparable<Postulante>, Serializable  {

    private String mail;
    private String telefono;
    private String linkedin;
    private int tipoTrabajo;
    // int tipoTrabajo PONDREMOS LAS OPCIONES DE TRABAJO 1/2/3
    private HashMap<Tematica, Integer> nivelTemas;
     private ArrayList<Entrevista> listaEntrevistas;
  

    public Postulante(String nombre, String direccion, int cedula, String mail, String telefono, String linkedin, int tipoTrabajo) {
        super(nombre, direccion, cedula);
        this.mail = mail;
        this.telefono = telefono;
        this.linkedin = linkedin;
        this.tipoTrabajo = tipoTrabajo;
        this.nivelTemas = new HashMap();
        this.listaEntrevistas = new ArrayList();

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public int getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(int tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public HashMap<Tematica, Integer> getNivelTemas() {
        return nivelTemas;
    }

    public void agregarNivelTemas(Tematica tematica, Integer valor) {

        nivelTemas.put(tematica, valor);
    }

   public void borrarNivelTemas( String clave) {
  Tematica t = null;
  for(Tematica tema : nivelTemas.keySet()) {
    if(tema.getNombre().equals(clave)) {
       t = tema;
      break;
    }
  }

  nivelTemas.remove(t);

}
    @Override
    public int compareTo(Postulante o) {
       return o.getListaEntrevistas().get(o.getListaEntrevistas().size() - 1).getPuntaje() - this.getListaEntrevistas().get(this.getListaEntrevistas().size() - 1).getPuntaje();

    }
    

     public void agregarEntrevista(Entrevista e) {
        getListaEntrevistas().add(e);
    }

    public ArrayList<Entrevista> getListaEntrevistas() {
        return listaEntrevistas;
    }


}
