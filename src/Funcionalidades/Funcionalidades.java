/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;

import Dominio.Postulante;
import Dominio.Sistema;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import javax.swing.*;
import javax.swing.table.*;
import java.io.Serializable;
import java.util.Comparator;

public class Funcionalidades implements Serializable, Comparator<Postulante>  {

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
      public static void limpiarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
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
                    mensajeM = false;
                }
            }
        }
        if (camposVacios && mensajeM) {
            String mensaje = "Error: Todos los campos son requeridos.";
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return camposVacios;

    }

    public boolean verificar(String cedula, String telefono, String mail, String linkedin) {
        boolean valido = true;
        try {
            int cedulaint = Integer.parseInt(cedula);
            int tele = Integer.parseInt(telefono);
            if (!mail.contains("@") || !linkedin.contains("https://www.linkedin.com")) {
                valido = false;
            }
        } catch (NumberFormatException e) {

            valido = false;
        }
        return valido;
    }
    
     public static void crearSistema(Sistema miS) throws IOException {
        
       

        FileOutputStream archivo = new FileOutputStream("Datos");
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(miS);
        datos.close();
    }

    public static Sistema recuperarSistema() throws IOException, ClassNotFoundException {

        FileInputStream archivo = new FileInputStream("Datos");
        
        ObjectInputStream datos = new ObjectInputStream(archivo);
        
        Sistema miS = (Sistema)datos.readObject();
        return miS;
    }
              @Override
  public int compare(Postulante p1, Postulante p2) {
    int cedulaCompare = Integer.compare(p1.getCedula(), p2.getCedula());
      return cedulaCompare; 
    
  }
        

}
