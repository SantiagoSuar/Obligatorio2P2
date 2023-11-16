package Interfaz;

import Funcionalidades.Funcionalidades;
import Dominio.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class HistoriaPostulante extends javax.swing.JDialog {

    DefaultTableModel modelo;
    Sistema miS;

    public HistoriaPostulante(java.awt.Frame parent, boolean modal, Sistema miS) {
        super(parent, modal);
        initComponents();
        this.miS = miS;
        miS.ordenarPostulantes(1);
        jLstPostulantes.setListData(miS.getListaPostulantes().toArray());
        modelo = new DefaultTableModel();
        modelo.addColumn("Nro");
        modelo.addColumn("Evaluador");
        modelo.addColumn("Puntaje");
        modelo.addColumn("Comentarios");
        this.jTblInfo.setModel(modelo);
    }

    public void DatosPos() {
        Postulante pos = (Postulante) jLstPostulantes.getSelectedValue();
        if (pos.getListaEntrevistas().size() >= 1) {
            jLblNombre.setText(pos.getNombre());
            jLblCI.setText("" + pos.getCedula());
            jLblDireccion.setText(pos.getDireccion());
            jLblTelefono.setText(pos.getTelefono());
            jLblMail.setText(pos.getMail());
            jLblLink.setText(pos.getLinkedin());
            if (pos.getTipoTrabajo() == 0) {
                jLblFormato.setText("Remoto");
            } else if (pos.getTipoTrabajo() == 1) {
                jLblFormato.setText("Presencial");
            } else {
                jLblFormato.setText("Mixto");
            }
            jLstExperiencia.setListData(miS.hashmapToArrylist(pos).toArray());
            String[] ar = new String[4];
            for (Entrevista e : pos.getListaEntrevistas()) {
                ar[0] = "" + e.getNumero();
                ar[1] = e.getEva().toString();
                ar[2] = "" + e.getPuntaje();
                ar[3] = e.getComentarios();
                modelo.addRow(ar);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jLstPostulantes = new javax.swing.JList();
        PnlPos = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        jLblCI = new javax.swing.JLabel();
        jLblDireccion = new javax.swing.JLabel();
        jLblTelefono = new javax.swing.JLabel();
        jLblMail = new javax.swing.JLabel();
        jLblLink = new javax.swing.JLabel();
        jLblFormato = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstExperiencia = new javax.swing.JList();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jBtnBuscar = new javax.swing.JButton();
        jBtnResetear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblInfo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLstPostulantes.setDragEnabled(true);
        jLstPostulantes.setInheritsPopupMenu(true);
        jLstPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstPostulantesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jLstPostulantes);

        jLblLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblLinkMouseExited(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Cédula:");

        jLabel4.setText("Direccíon:");

        jLabel5.setText("Télefono:");

        jLabel6.setText("Mail:");

        jLabel7.setText("Linkedin:");

        jLabel13.setText("Formato: ");

        jLstExperiencia.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLstExperiencia);

        jLabel15.setText("Experiencia :");

        javax.swing.GroupLayout PnlPosLayout = new javax.swing.GroupLayout(PnlPos);
        PnlPos.setLayout(PnlPosLayout);
        PnlPosLayout.setHorizontalGroup(
            PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPosLayout.createSequentialGroup()
                        .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlPosLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPosLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)))
                                .addGroup(PnlPosLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(45, 45, 45))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPosLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(32, 32, 32)))
                            .addGroup(PnlPosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59)))
                        .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLblMail, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPosLayout.createSequentialGroup()
                        .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addGap(34, 34, 34)
                        .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblLink, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );
        PnlPosLayout.setVerticalGroup(
            PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLblCI, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLblLink, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(34, 34, 34)
                .addGroup(PnlPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel16.setText("Buscar :");

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnResetear.setText("Resetear");
        jBtnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetearActionPerformed(evt);
            }
        });

        jTblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblInfo.setFocusable(false);
        jTblInfo.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(jTblInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Historia postulante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel16)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlPos, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(PnlPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnBuscar)
                        .addComponent(jBtnResetear))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLstPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstPostulantesValueChanged
        Funcionalidades.limpiarTabla(jTblInfo);
        DatosPos();
    }//GEN-LAST:event_jLstPostulantesValueChanged

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        Postulante pos = (Postulante) jLstPostulantes.getSelectedValue();
        String palabra = jTxtBuscar.getText();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String comentarios = (String) pos.getListaEntrevistas().get(i).getComentarios();
            if (comentarios.contains(palabra)) {
                comentarios = "<html>" + comentarios.replaceAll(palabra, "<font color='red'>" + palabra + "</font>") + "</html>";
                modelo.setValueAt(comentarios, i, 3);
            }
        }
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetearActionPerformed
        Funcionalidades.limpiarTxt(jPanel1
        );
        Postulante pos = (Postulante) jLstPostulantes.getSelectedValue();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String comentarios = (String) pos.getListaEntrevistas().get(i).getComentarios();
            modelo.setValueAt(comentarios, i, 3);
        }
    }//GEN-LAST:event_jBtnResetearActionPerformed

    private void jLblLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblLinkMouseClicked
        try {
            Desktop.getDesktop().browse(new URI(jLblLink.getText()));
        } catch (URISyntaxException ex) {
            Logger.getLogger(HistoriaPostulante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HistoriaPostulante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLblLinkMouseClicked

    private void jLblLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblLinkMouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLblLinkMouseEntered

    private void jLblLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblLinkMouseExited
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLblLinkMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlPos;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLblCI;
    private javax.swing.JLabel jLblDireccion;
    private javax.swing.JLabel jLblFormato;
    private javax.swing.JLabel jLblLink;
    private javax.swing.JLabel jLblMail;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblTelefono;
    private javax.swing.JList jLstExperiencia;
    private javax.swing.JList jLstPostulantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTblInfo;
    private javax.swing.JTextField jTxtBuscar;
    // End of variables declaration//GEN-END:variables
}
