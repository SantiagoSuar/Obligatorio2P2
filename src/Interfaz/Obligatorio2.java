package Interfaz;

import Dominio.*;
import javax.swing.JFrame;

public class Obligatorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema miS = new Sistema();
        Funcionalidades func = new Funcionalidades();
        Menu miM= new Menu(miS,func);
        miM.setVisible(true);
        
        
    }

}

