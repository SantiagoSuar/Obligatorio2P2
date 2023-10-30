package Dominio;
import java.util.HashMap;

public class Postulante extends Persona{
    private String mail;    
    private String telefono;
    private String linkedin;
    private int tipoTrabajo;
    // int tipoTrabajo PONDREMOS LAS OPCIONES DE TRABAJO 1/2/3
    private HashMap<Tematica, Integer> nivelTemas;
    
    public Postulante(String nombre, String direccion,String cedula,String mail, String telefono,String linkedin,int tipoTrabajo){
        super(nombre, direccion,cedula);
        this.mail=mail;        
        this.telefono=telefono;
        this.linkedin=linkedin;
        this.tipoTrabajo=tipoTrabajo;
        this.nivelTemas= new HashMap();
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
    

}
