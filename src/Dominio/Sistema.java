package Dominio;

import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {

    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Tematica> listaTematicas;
    private ArrayList<Puesto> listaPuestos;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Entrevista> listaEntrevistas;
    private HashMap<Tematica, Integer> nivelTemas;

    public Sistema() {
        this.listaPostulantes = new ArrayList();
        this.listaTematicas = new ArrayList();
        this.listaPuestos = new ArrayList();
        this.listaEvaluadores = new ArrayList();
        this.nivelTemas= new HashMap();
    }

    public boolean seRepiteCedula(Persona p) {
        boolean seRepite = false;
        if (!listaPostulantes.isEmpty()) {
            for (int i = 0; i < getListaPostulantes().size(); i++) {
                if (p.getCedula().equalsIgnoreCase(getListaPostulantes().get(i).getCedula())) {
                    seRepite = true;
                }
            }
        }
        return seRepite;
    }

    public boolean seRepiteTematica(Tematica t) {
        boolean seRepite = false;
        if (!listaTematicas.isEmpty()) {
            for (int i = 0; i < getListaTematicas().size(); i++) {
                if (t.getNombre().equalsIgnoreCase(getListaTematicas().get(i).getNombre())) {
                    seRepite = true;
                }
            }
        }
        return seRepite;
    }

    public void agregarPostulante(Postulante p) {
        if (!seRepiteCedula(p)) {
            getListaPostulantes().add(p);
        }
    }

    public void agregarTematica(Tematica t) {
        if (!seRepiteTematica(t)) {
            getListaTematicas().add(t);
        }
    }

    public void agregarPuesto(Puesto p) {
        getListaPuestos().add(p);
    }

    public void agregarEvaluador(Evaluador e) {
        getListaEvaluadores().add(e);
    }

    public void agregarEntrevista(Entrevista e) {
        getListaEntrevistas().add(e);
    }

    /**
     * @return the listaPostulantes
     */
    public ArrayList<Postulante> getListaPostulantes() {
        return listaPostulantes;
    }

    /**
     * @return the listaTematicas
     */
    public ArrayList<Tematica> getListaTematicas() {
        return listaTematicas;
    }

    /**
     * @return the listaPuestos
     */
    public ArrayList<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    /**
     * @return the listaEvaluadores
     */
    public ArrayList<Evaluador> getListaEvaluadores() {
        return listaEvaluadores;
    }

    /**
     * @return the listaEntrevistas
     */
    public ArrayList<Entrevista> getListaEntrevistas() {
        return listaEntrevistas;
    }
      public HashMap<Tematica, Integer> getNivelTemas() {
        return nivelTemas;
    }
    
    public void setNivelTemas(Tematica tematica, Integer valor) {
        nivelTemas.put(tematica, valor);
    }
}
