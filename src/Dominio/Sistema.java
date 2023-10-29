package Dominio;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Tematica> listaTematicas;
    private ArrayList<Puesto> listaPuestos;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Entrevista> listaEntrevistas;

    public Sistema() {
        this.listaPostulantes = new ArrayList();
        this.listaTematicas = new ArrayList();
        this.listaPuestos = new ArrayList();
        this.listaEvaluadores = new ArrayList();
    }

    public void agregarPostulante(Postulante p) {
        listaPostulantes.add(p);
    }

    public boolean seRepiteTematica(Tematica t) {
        boolean seRepite = false;
        if (!listaTematicas.isEmpty()) {
            for (int i = 0; i < listaTematicas.size(); i++) {
                if (t.getNombre().equals(listaTematicas.get(i).getNombre())) {
                    seRepite = true;
                }
            }
        }
        return seRepite;
    }

    public void agregarTematica(Tematica t) {
        if (!seRepiteTematica(t)) {
            listaTematicas.add(t);
        }
    }

    public void agregarPuesto(Puesto p) {
        listaPuestos.add(p);
    }

    public void agregarEvaluador(Evaluador e) {
        listaEvaluadores.add(e);
    }

    public void agregarEntrevista(Entrevista e) {
        listaEntrevistas.add(e);
    }
}