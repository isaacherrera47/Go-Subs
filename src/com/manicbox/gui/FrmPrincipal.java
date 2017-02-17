package com.manicbox.gui;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author isaac.herrera
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fchPelicula = new javax.swing.JFileChooser();
        dlgOpciones = new javax.swing.JDialog();
        pnlPrincipal = new javax.swing.JPanel();
        txtPelicula = new javax.swing.JTextField();
        btnExaminar = new javax.swing.JButton();
        lblPrincipal = new javax.swing.JLabel();
        btnOpciones = new javax.swing.JButton();

        fchPelicula.setDragEnabled(true);

        dlgOpciones.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgOpciones.setTitle("Opciones");
        dlgOpciones.setMinimumSize(new java.awt.Dimension(800, 600));
        dlgOpciones.setModal(true);
        dlgOpciones.setPreferredSize(new java.awt.Dimension(800, 600));
        dlgOpciones.setResizable(false);

        javax.swing.GroupLayout dlgOpcionesLayout = new javax.swing.GroupLayout(dlgOpciones.getContentPane());
        dlgOpciones.getContentPane().setLayout(dlgOpcionesLayout);
        dlgOpcionesLayout.setHorizontalGroup(
            dlgOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dlgOpcionesLayout.setVerticalGroup(
            dlgOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Go! Subs");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        txtPelicula.setEditable(false);
        txtPelicula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPelicula.setDragEnabled(true);

        btnExaminar.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        btnExaminar.setText("Examinar...");
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });

        lblPrincipal.setFont(new java.awt.Font("Roboto Condensed", 0, 48)); // NOI18N
        lblPrincipal.setText("Subtitulos");

        btnOpciones.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        btnOpciones.setText("Opciones");
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(lblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOpciones)
                .addGap(46, 46, 46))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(lblPrincipal)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(233, 233, 233)
                .addComponent(btnOpciones)
                .addGap(21, 21, 21))
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        dlgOpciones.setVisible(true);
    }//GEN-LAST:event_btnOpcionesActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        int isFile = fchPelicula.showOpenDialog(this);
        if (isFile == JFileChooser.APPROVE_OPTION && fchPelicula.getSelectedFile() != null) {
            File pelicula =  fchPelicula.getSelectedFile();
            new dlgSubtitulos(this, true, pelicula).setVisible(true);
        }
    }//GEN-LAST:event_btnExaminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JDialog dlgOpciones;
    private javax.swing.JFileChooser fchPelicula;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtPelicula;
    // End of variables declaration//GEN-END:variables
}
