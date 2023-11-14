package Interfaz;

import Dominio.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class VentanaNivelesTemas extends javax.swing.JDialog {

    private Sistema miS;
    private Postulante pos;

    public VentanaNivelesTemas(java.awt.Frame parent, boolean modal, Postulante pos, Sistema elSistema) {
        super(parent, modal);
        initComponents();
        this.pos = pos;
        miS = elSistema;
        tematicasCombos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboTema = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtnAgregar = new javax.swing.JButton();
        jBtnRegistrar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        SpnNivel = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        panexp = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ComboTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTemaActionPerformed(evt);
            }
        });

        jLabel1.setText("Tematica:");

        jLabel2.setText("Nivel:");

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnRegistrar.setText("Registrar");
        jBtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Experiencia:");

        jScrollPane2.setViewportView(panexp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboTema, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SpnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAgregar)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(jBtnEliminar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRegistrar)
                    .addComponent(jBtnCancelar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        String nombre = (String) ComboTema.getSelectedItem();
        if(nombre!=null){
        Tematica elementoSeleccionado = tematicasMap.get(nombre);
        int valorSeleccionado = (int) SpnNivel.getValue();
        pos.agregarNivelTemas(elementoSeleccionado, valorSeleccionado);
        panexp.setListData(miS.hashmapToArrylist(pos).toArray());
        }
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
       String temat = (String) panexp.getSelectedValue();
       if(temat!=null){
       int indexAbreParentesis = temat.indexOf("(");
        String clave = temat.substring(0, indexAbreParentesis);
        pos.borrarNivelTemas(clave);
        panexp.setListData(miS.hashmapToArrylist(pos).toArray());
       }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void ComboTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTemaActionPerformed

    private void jBtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarActionPerformed
        dispose();
        miS.agregarPostulante(pos);
        String mensaje = "El postulante ha sido agregado";
        JOptionPane.showMessageDialog(null, mensaje, "Confirmado", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jBtnRegistrarActionPerformed

  
    HashMap<String, Tematica> tematicasMap = new HashMap<>();

    public void tematicasCombos() {
        for (Tematica tematica : miS.getListaTematicas()) {
            ComboTema.addItem(tematica.getNombre());
            tematicasMap.put(tematica.getNombre(), tematica);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTema;
    private javax.swing.JSpinner SpnNivel;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList panexp;
    // End of variables declaration//GEN-END:variables
}
