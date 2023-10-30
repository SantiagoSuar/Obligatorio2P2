/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Santiago
 */
public class Funcionalidades {
      public static void limpiarTxt(JPanel panel){
     for(Component c : panel.getComponents()){
         if(c instanceof JTextField){
         ((JTextField)c).setText("");
         
         }else if(c instanceof JTextArea){
         ((JTextArea)c).setText("");
         
         }
     }
     
        
    }
}
