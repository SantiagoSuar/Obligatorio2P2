package Dominio;

public class Entrevista {
    private Postulante pos;
    private Evaluador eva;
    private int puntaje;
    private String comentarios;
    private int numero;
    
    
    public Entrevista(Postulante pos,Evaluador eva,int puntaje,String comentarios,int numero){
        this.pos=pos;
        this.eva=eva;
        this.puntaje=0;
        this.comentarios=comentarios;
        this.numero=numero;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
