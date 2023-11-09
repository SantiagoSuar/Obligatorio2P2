package Interfaz;

import Dominio.Sistema;
import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame {

    private Sistema miS;
    private Funcionalidades func;
    public Menu(Sistema miS, Funcionalidades func) {
        this.miS=miS;
        this.func=func;
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
        jBtnEliminoPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminoPostulanteActionPerformed(evt);
            }
        });

        jBtnRegistroEntrevista.setText("Registrar Entrevista");
        jBtnRegistroEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistroEntrevistaActionPerformed(evt);
            }
        });

        jBtnHistoriaPostulante.setText("Historia de Postulante");
        jBtnHistoriaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHistoriaPostulanteActionPerformed(evt);
            }
        });

        jBtnRegistroEvaluador.setText("Registrar Evaluador");
        jBtnRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistroEvaluadorActionPerformed(evt);
            }
        });

        jBtnRegistroPuesto.setText("Registrar Puesto");
        jBtnRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistroPuestoActionPerformed(evt);
            }
        });

        jBtnConsultaTematica.setText("Consultar por Tematica");

        jBtnConsultaPuesto.setText("Consultar para Puesto");
        jBtnConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultaPuestoActionPerformed(evt);
            }
        });

        jBtnFin.setText("Fin");
        jBtnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFinActionPerformed(evt);
            }
        });

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
        VentanaAltaPostulante v = new VentanaAltaPostulante(frame,true,miS,func);
        v.setVisible(true);
    }//GEN-LAST:event_jBtnRegistroPostulanteActionPerformed

    private void jBtnConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultaPuestoActionPerformed
      JFrame frame = new JFrame("CONSULTA PUESTO");
        ConsultaPuesto v = new ConsultaPuesto(frame,true,miS);
        v.setVisible(true);
    }//GEN-LAST:event_jBtnConsultaPuestoActionPerformed

    private void jBtnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnFinActionPerformed

    private void jBtnEliminoPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminoPostulanteActionPerformed
         JFrame frame = new JFrame("BAJA POSTULANTE");
        VentanaBajaPostulante v = new VentanaBajaPostulante(frame,true,miS);
        v.setVisible(true);
    }//GEN-LAST:event_jBtnEliminoPostulanteActionPerformed

    private void jBtnRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistroEvaluadorActionPerformed
        JFrame frame = new JFrame("ALTA EVALUADOR");
        RegistroEvaluador v = new RegistroEvaluador(frame,true,miS,func);
        v.setVisible(true);
    }//GEN-LAST:event_jBtnRegistroEvaluadorActionPerformed

    private void jBtnRegistroEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistroEntrevistaActionPerformed
        JFrame frame = new JFrame("Ingreso Entrecista");
        IngresoEntrevista v = new IngresoEntrevista(frame,true,miS,func);
        v.setVisible(true);
    }//GEN-LAST:event_jBtnRegistroEntrevistaActionPerformed

    private void jBtnRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistroPuestoActionPerformed
        JFrame frame = new JFrame("Ingreso Puesto");
        IngreesoPuesto v = new IngreesoPuesto(frame,true,miS);
        v.setVisible(true);
    }//GEN-LAST:event_jBtnRegistroPuestoActionPerformed


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
