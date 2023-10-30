/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Santiago
 */
public class Funcionalidades {
     public static void limpiarTxt(Container container) {
    for (Component c : container.getComponents()) {
        if (c instanceof JTextField) {
            ((JTextField) c).setText("");
        } else if (c instanceof JTextArea) {
            ((JTextArea) c).setText("");
        } else if (c instanceof Container) {
            limpiarTxt((Container) c); // Llamada recursiva para limpiar los componentes internos del contenedor
        }
    }
}
     
}
