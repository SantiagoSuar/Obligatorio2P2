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
    public static boolean verificarForm(Container container) {
    boolean camposVacios = false;
     boolean mensajeM = true;
    for (Component c : container.getComponents()) {
        if (c instanceof JTextField) {
            JTextField textField = (JTextField) c;
            textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            if (textField.getText().trim().isEmpty()) {
                camposVacios = true;
                textField.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
        } else if (c instanceof JTextArea) {
            JTextArea textArea = (JTextArea) c;
            textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            if (textArea.getText().trim().isEmpty()) {
                camposVacios = true;
                textArea.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
        } else if (c instanceof Container) {
            if (verificarForm((Container) c)) {
                camposVacios = true;
                mensajeM=false;
            }
        }
    }
    if(camposVacios && mensajeM){
        String mensaje = "Error: Todos los campos son requeridos.";
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    return camposVacios;
    
}
     public boolean verificar(String cedula,String telefono,String mail,String linkedin){
        boolean valido=true;
        try{
            int cedulaint = Integer.parseInt(cedula);
            int tele = Integer.parseInt(telefono);
            if(!mail.contains("@") || !linkedin.contains("https://www.linkedin.com")){
                valido=false;
            }
        }catch(NumberFormatException e){
        
            valido=false;
        }
        return valido;
    }

     
}
