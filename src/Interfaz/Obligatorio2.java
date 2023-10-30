package Interfaz;

import Dominio.Sistema;
import javax.swing.JFrame;

public class Obligatorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema miS = new Sistema();
        Ventana1 v1 = new Ventana1(miS);
        v1.setVisible(true);
        Ventana2 v2 = new Ventana2(miS);
        JFrame frame = new JFrame();
        frame.add(v2);
        frame.pack();
        frame.setVisible(true);
        v2.setVisible(true);
        Ventana3 v3 = new Ventana3(miS);
        v3.setVisible(true);
    }

}

// fgdgvfdgadgraegfadgerdgwergaegear
