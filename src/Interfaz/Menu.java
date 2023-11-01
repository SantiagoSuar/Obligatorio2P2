package Interfaz;

import Dominio.Sistema;
import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame {

    private Sistema miS;
    public Menu(Sistema miS) {
        this.miS=miS;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnRegistroPostulante = new javax.swing.JButton();
        jBtnRegistroTematica = new javax.swing.JButton();
        jBtnEliminoPostulante = new javax.swing.JButton();
        jBtnRegistroEntrevista = new javax.swing.JButton();
        jBtnHistoriaPostulante = new javax.swing.JButton();
        jBtnRegistroEvaluador = new javax.swing.JButton();
        jBtnRegistroPuesto = new javax.swing.JButton();
        jBtnConsultaTematica = new javax.swing.JButton();
        jBtnConsultaPuesto = new javax.swing.JButton();
        jBtnFin = new javax.swing.JButton();
        jLblTitulo = new javax.swing.JLabel();
        jLblPregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnRegistroPostulante.setText("Registrar Postulante");
        jBtnRegistroPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistroPostulanteActionPerformed(evt);
            }
        });

        jBtnRegistroTematica.setText("Registrar Tematica");
        jBtnRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistroTematicaActionPerformed(evt);
            }
        });

        jBtnEliminoPostulante.setText("Eliminar Postulante");

        jBtnRegistroEntrevista.setText("Registrar Entrevista");

        jBtnHistoriaPostulante.setText("Historia de Postulante");
        jBtnHistoriaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHistoriaPostulanteActionPerformed(evt);
            }
        });

        jBtnRegistroEvaluador.setText("Registrar Evaluador");

        jBtnRegistroPuesto.setText("Registrar Puesto");

        jBtnConsultaTematica.setText("Consultar por Tematica");

        jBtnConsultaPuesto.setText("Consultar para Puesto");
        jBtnConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultaPuestoActionPerformed(evt);
            }
        });

        jBtnFin.setText("Fin");

        jLblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLblTitulo.setText("Consultora");

        jLblPregunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLblPregunta.setText("¿Que accion desea realizar?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnRegistroEntrevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnConsultaTematica, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jBtnRegistroPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnRegistroEvaluador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnHistoriaPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jBtnConsultaPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBtnRegistroTematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnRegistroPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jBtnEliminoPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnFin)
                .addGap(266, 266, 266))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLblPregunta)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblPregunta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRegistroTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRegistroEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRegistroPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnHistoriaPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRegistroEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRegistroPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConsultaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEliminoPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConsultaPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtnFin)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegistroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistroTematicaActionPerformed
        JFrame frame = new JFrame("REGISTRO TEMATICA");
        VentanaRegistrarTematica v = new VentanaRegistrarTematica(frame,true,miS);
        v.setVisible(true);
    }//GEN-LAST:event_jBtnRegistroTematicaActionPerformed

    private void jBtnHistoriaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHistoriaPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnHistoriaPostulanteActionPerformed

    private void jBtnRegistroPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistroPostulanteActionPerformed
        JFrame frame = new JFrame("ALTA POSTULANTE");
        VentanaAltaPostulante v = new VentanaAltaPostulante(frame,true,miS);
        v.setVisible(true);
    }//GEN-LAST:event_jBtnRegistroPostulanteActionPerformed

    private void jBtnConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultaPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConsultaPuestoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConsultaPuesto;
    private javax.swing.JButton jBtnConsultaTematica;
    private javax.swing.JButton jBtnEliminoPostulante;
    private javax.swing.JButton jBtnFin;
    private javax.swing.JButton jBtnHistoriaPostulante;
    private javax.swing.JButton jBtnRegistroEntrevista;
    private javax.swing.JButton jBtnRegistroEvaluador;
    private javax.swing.JButton jBtnRegistroPostulante;
    private javax.swing.JButton jBtnRegistroPuesto;
    private javax.swing.JButton jBtnRegistroTematica;
    private javax.swing.JLabel jLblPregunta;
    private javax.swing.JLabel jLblTitulo;
    // End of variables declaration//GEN-END:variables
}
