package Dominio;

import java.util.ArrayList;
import java.util.Collections;


public class Sistema {

    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Tematica> listaTematicas;
    private ArrayList<Puesto> listaPuestos;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Postulante> candidatos;
    private boolean newSist;

    public Sistema(boolean a) {
        this.listaPostulantes = new ArrayList();
        this.listaTematicas = new ArrayList();
        this.listaPuestos = new ArrayList();
        this.listaEvaluadores = new ArrayList();
        this.candidatos = new ArrayList();
        newSist=true;

    }

    public boolean seRepiteCedula(Persona p) {
        boolean seRepite = false;
        if (!listaPostulantes.isEmpty()) {
            for (int i = 0; i < getListaPostulantes().size() && !seRepite; i++) {
                if (p.getCedula() == getListaPostulantes().get(i).getCedula()) {
                    seRepite = true;
                }
            }
        }
        return seRepite;
    }

    public boolean seRepiteCedulaEva(Persona p) {
        boolean seRepite = false;
        if (!listaEvaluadores.isEmpty()) {
            for (int i = 0; i < getListaEvaluadores().size() && !seRepite; i++) {
                if (p.getCedula() == getListaEvaluadores().get(i).getCedula()) {
                    seRepite = true;
                }
            }
        }
        return seRepite;
    }

    public boolean seRepiteTematica(Tematica t) {
        boolean seRepite = false;
        if (!listaTematicas.isEmpty()) {
            for (int i = 0; i < getListaTematicas().size() && !seRepite; i++) {
                if (t.getNombre().equalsIgnoreCase(getListaTematicas().get(i).getNombre())) {
                    seRepite = true;
                }
            }
        }
        return seRepite;
    }

    public boolean seRepitePuesto(Puesto o) {
        boolean seRepite = false;
        if (!listaPuestos.isEmpty()) {
            for (int i = 0; i < getListaPuestos().size() && !seRepite; i++) {
                if (o.getNombre().equalsIgnoreCase(getListaPuestos().get(i).getNombre())) {
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

   

    public ArrayList<Postulante> getListaPostulantes() {
        return listaPostulantes;
    }

    public ArrayList<Tematica> getListaTematicas() {
        return listaTematicas;
    }

    public ArrayList<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public ArrayList<Evaluador> getListaEvaluadores() {
        return listaEvaluadores;
    }


    public ArrayList<Postulante> getCandidatos() {
        return candidatos;
    }

    public void ordenarPostulantes() {
        Collections.sort(getCandidatos());
    }
 

    public ArrayList<String> hashmapToArrylist(Postulante pos) {
        ArrayList<String> list = new ArrayList<String>();
        for (Tematica key : pos.getNivelTemas().keySet()) {
            Integer value = pos.getNivelTemas().get(key);
            String element = key + "(" + value + ")";
            list.add(element);
        }
        return list;
    }

}
