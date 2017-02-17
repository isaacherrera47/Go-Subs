package com.manicbox.gui;

import java.io.File;

/**
 *
 * @author isaac.herrera
 */
public class dlgSubtitulos extends javax.swing.JDialog {

    /**
     * Creates new form dlgSubtitulos
     * @param parent
     * @param modal
     * @param pelicula
     */
    public dlgSubtitulos(java.awt.Frame parent, boolean modal, File pelicula) {
        super(parent, modal);
        this.pelicula =  pelicula;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    File pelicula;
}
