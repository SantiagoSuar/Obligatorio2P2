package Interfaz;

import Funcionalidades.Funcionalidades;
import Dominio.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inicio extends javax.swing.JFrame {

private boolean nuevo;

    public Inicio(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnDesdeCero = new javax.swing.JButton();
        jBtnDatosAnteriores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnDesdeCero.setText("Comenzar desde cero");
        jBtnDesdeCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDesdeCeroActionPerformed(evt);
            }
        });

        jBtnDatosAnteriores.setText("Tomar datos anteriores");
        jBtnDatosAnteriores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDatosAnterioresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¿Desea tomar los datos anteriores o comenzar desde cero?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jBtnDesdeCero, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jBtnDatosAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDesdeCero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDatosAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jBtnDesdeCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDesdeCeroActionPerformed
       nuevo=false;
         Sistema miS = new Sistema();
        Funcionalidades func = new Funcionalidades();
        Menu miM= new Menu(miS,func,nuevo);
        dispose();
        miM.setVisible(true);
    }//GEN-LAST:event_jBtnDesdeCeroActionPerformed

    private void jBtnDatosAnterioresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDatosAnterioresActionPerformed
        nuevo=true;
        Funcionalidades func = new Funcionalidades();
        Menu miM = null;
    try {
        miM = new Menu(Funcionalidades.recuperarSistema(),func,nuevo);
    } catch (IOException ex) {
        Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
    }
        dispose();
        miM.setVisible(true);
    }//GEN-LAST:event_jBtnDatosAnterioresActionPerformed
    
    public boolean nuevoSis() {
        return nuevo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDatosAnteriores;
    private javax.swing.JButton jBtnDesdeCero;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
