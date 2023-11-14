package Dominio;

public class Entrevista {

    private Postulante pos;
    private Evaluador eva;
    private int puntaje;
    private String comentarios;
    private int numero;

    public Entrevista(Postulante pos, Evaluador eva, int puntaje, String comentarios, int numero) {
        this.pos = pos;
        this.eva = eva;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Postulante getPos() {
        return pos;
    }

    public void setPos(Postulante pos) {
        this.pos = pos;
    }

    public Evaluador getEva() {
        return eva;
    }

    public void setEva(Evaluador eva) {
        this.eva = eva;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
}
