package Interfaz;

import Dominio.*;
import javax.swing.JFrame;

public class Obligatorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema miS = new Sistema();
        Menu miM= new Menu(miS);
        miM.setVisible(true);
        
        


//        JFrame frame = new JFrame();
//        frame.add(v2);
//        frame.pack();
//        frame.setVisible(true);
//        v2.setVisible(true);
        
    }

}

