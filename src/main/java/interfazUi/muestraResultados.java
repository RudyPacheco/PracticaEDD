/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazUi;

import funcionUi.llenarTablaR;
import funcionUi.ordenarResultados;
import funcionUi.reporteT;
import objetos.apuesta;

/**
 *
 * @author andaryus7
 */
public class muestraResultados extends javax.swing.JFrame {

    /**
     * Creates new form muestraResultados
     */
      llenarTablaR llenarTabla ;
      apuesta[] apuestas;
      reporteT reportes;
    public muestraResultados(apuesta[] apuestas,reporteT reporte) {
        initComponents();
        this.apuestas=apuestas;
        this.reportes=reporte;
        llenarTabla = new llenarTablaR();
        llenarTabla.reporteResultados(apuestas, jTableResultados);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelIzquierdo = new javax.swing.JPanel();
        jPanelInferior = new javax.swing.JPanel();
        jButtonReportes = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBackground(new java.awt.Color(0, 153, 255));
        jPanelSuperior.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Hack", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultados de la Apuesta ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 255, 52, 250);
        jPanelSuperior.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelDerecho.setBackground(new java.awt.Color(0, 153, 255));

        jButton1.setText("Ordenar Alfabeticamente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ordenar Por Puntaje");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDerechoLayout = new javax.swing.GroupLayout(jPanelDerecho);
        jPanelDerecho.setLayout(jPanelDerechoLayout);
        jPanelDerechoLayout.setHorizontalGroup(
            jPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDerechoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDerechoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDerechoLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(28, 28, 28))))
        );
        jPanelDerechoLayout.setVerticalGroup(
            jPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(348, Short.MAX_VALUE))
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
            .addGap(0, 422, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelIzquierdo, java.awt.BorderLayout.LINE_START);

        jPanelInferior.setBackground(new java.awt.Color(0, 153, 255));

        jButtonReportes.setText("Reportes");
        jButtonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportesActionPerformed(evt);
            }
        });

        jButton3.setText("Nueva Carrera");
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
                .addGap(59, 59, 59)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 533, Short.MAX_VALUE)
                .addComponent(jButtonReportes)
                .addGap(106, 106, 106))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReportes)
                    .addComponent(jButton3))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        jPanelCentral.setLayout(new javax.swing.BoxLayout(jPanelCentral, javax.swing.BoxLayout.LINE_AXIS));

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableResultados);

        jPanelCentral.add(jScrollPane1);

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ordenarResultados ordenar = new ordenarResultados();
       apuestas= ordenar.ordenarAlfabeticamente(apuestas);
       reportes.setTimpoPormedioOrdenamientoN(ordenar.getTiempoOrdenamientoAlfabetico());
        llenarTabla.reporteResultados(apuestas, jTableResultados);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         ordenarResultados ordenar = new ordenarResultados();
       apuestas= ordenar.ordenarPorPuntos(apuestas);
       reportes.setTimpoPormedioOrdenamientoP(ordenar.getTiempoOrdenamientoPuntos());
        llenarTabla.reporteResultados(apuestas, jTableResultados);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportesActionPerformed
        // TODO add your handling code here:
        reportes ventanaR = new reportes(reportes,this);
        ventanaR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonReportesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        ventanaInicial ventana = new ventanaInicial();
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelDerecho;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
}