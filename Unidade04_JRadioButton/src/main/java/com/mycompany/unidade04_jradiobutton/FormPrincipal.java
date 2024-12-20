/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.unidade04_jradiobutton;

import java.awt.Font;

/**
 *
 * @author edwar
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMudaFonte = new javax.swing.ButtonGroup();
        tfTexto = new javax.swing.JTextField();
        rbNegrito = new javax.swing.JRadioButton();
        rbItalico = new javax.swing.JRadioButton();
        rbNormal = new javax.swing.JRadioButton();
        rbNegritoItalico = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfTexto.setText("Mostra mudança no estilo da fonte.");

        btgMudaFonte.add(rbNegrito);
        rbNegrito.setText("Negrito");
        rbNegrito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbNegritoItemStateChanged(evt);
            }
        });

        btgMudaFonte.add(rbItalico);
        rbItalico.setText("Itállico");
        rbItalico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbItalicoItemStateChanged(evt);
            }
        });

        btgMudaFonte.add(rbNormal);
        rbNormal.setText("Normal");
        rbNormal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbNormalItemStateChanged(evt);
            }
        });

        btgMudaFonte.add(rbNegritoItalico);
        rbNegritoItalico.setText("Negrito /  Itálico");
        rbNegritoItalico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbNegritoItalicoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbNegrito)
                                .addGap(26, 26, 26)
                                .addComponent(rbItalico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbNormal))
                            .addComponent(tfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(rbNegritoItalico)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNegrito)
                    .addComponent(rbItalico)
                    .addComponent(rbNormal))
                .addGap(18, 18, 18)
                .addComponent(rbNegritoItalico)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNegritoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbNegritoItemStateChanged
        mudaFonte();
    }//GEN-LAST:event_rbNegritoItemStateChanged

    private void rbItalicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbItalicoItemStateChanged
        mudaFonte();
    }//GEN-LAST:event_rbItalicoItemStateChanged

    private void rbNormalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbNormalItemStateChanged
        mudaFonte();
    }//GEN-LAST:event_rbNormalItemStateChanged

    private void rbNegritoItalicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbNegritoItalicoItemStateChanged
        mudaFonte();
    }//GEN-LAST:event_rbNegritoItalicoItemStateChanged

    private void mudaFonte(){
        if(rbNegritoItalico.isSelected())
            tfTexto.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 14));
        else
            if(rbItalico.isSelected())
                tfTexto.setFont(new Font("Serif", Font.ITALIC, 14));
            else
                if(rbNegrito.isSelected())
                    tfTexto.setFont(new Font("Serif", Font.BOLD, 14));
                else
                    tfTexto.setFont(new Font("Serif", Font.PLAIN, 14));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgMudaFonte;
    private javax.swing.JRadioButton rbItalico;
    private javax.swing.JRadioButton rbNegrito;
    private javax.swing.JRadioButton rbNegritoItalico;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JTextField tfTexto;
    // End of variables declaration//GEN-END:variables
}
