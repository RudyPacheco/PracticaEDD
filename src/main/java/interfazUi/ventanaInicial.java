/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazUi;

import funcionUi.leerArchivo;
import funcionUi.validacionApuesta;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import objetos.apuesta;

/**
 *
 * @author andaryus7
 */
public class ventanaInicial extends javax.swing.JFrame {

    /**
     * Creates new form ventanaInicial
     */
     private apuesta apuestas[];
    private leerArchivo leerArchivo;
    
    public ventanaInicial() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelDerecho = new javax.swing.JPanel();
        jPanelIzquierdo = new javax.swing.JPanel();
        jPanelInferior = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jButtonAbrirTexto = new javax.swing.JButton();
        jButtonIngresoUi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBackground(new java.awt.Color(0, 153, 255));
        jPanelSuperior.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Hack", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingreso de apuestas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 166, 45, 175);
        jPanelSuperior.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelDerecho.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanelDerechoLayout = new javax.swing.GroupLayout(jPanelDerecho);
        jPanelDerecho.setLayout(jPanelDerechoLayout);
        jPanelDerechoLayout.setHorizontalGroup(
            jPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelDerechoLayout.setVerticalGroup(
            jPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelDerecho, java.awt.BorderLayout.LINE_END);

        jPanelIzquierdo.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanelIzquierdoLayout = new javax.swing.GroupLayout(jPanelIzquierdo);
        jPanelIzquierdo.setLayout(jPanelIzquierdoLayout);
        jPanelIzquierdoLayout.setHorizontalGroup(
            jPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelIzquierdoLayout.setVerticalGroup(
            jPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelIzquierdo, java.awt.BorderLayout.LINE_START);

        jPanelInferior.setBackground(new java.awt.Color(0, 153, 255));

        jButton3.setText("Cerrar Apuestas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(30, 30, 30))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBackground(new java.awt.Color(0, 153, 255));

        jButtonAbrirTexto.setText("Abrir texto");
        jButtonAbrirTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirTextoActionPerformed(evt);
            }
        });
        jPanelCentral.add(jButtonAbrirTexto);

        jButtonIngresoUi.setText("Ingresar Apuesta");
        jButtonIngresoUi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoUiActionPerformed(evt);
            }
        });
        jPanelCentral.add(jButtonIngresoUi);

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirTextoActionPerformed
        // TODO add your handling code here:
        
        leerArchivo= new  leerArchivo();
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fileChosser.getSelectedFile();
            try {
                apuestas = this.leerArchivo.leerFichero(fichero, apuestas);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo");
            }
        }
        
        
    }//GEN-LAST:event_jButtonAbrirTextoActionPerformed

    private void jButtonIngresoUiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoUiActionPerformed
        // TODO add your handling code here:
        ingresarApuesta ventanaApuesta = new ingresarApuesta(this);
        ventanaApuesta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonIngresoUiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        validacionApuesta validar = new validacionApuesta();
        validar.validarApuestas(apuestas, apuestas[0].getLista());
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAbrirTexto;
    private javax.swing.JButton jButtonIngresoUi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelDerecho;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
