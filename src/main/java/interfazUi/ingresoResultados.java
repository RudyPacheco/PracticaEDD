/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazUi;

import funcionUi.calcularResultados;
import funcionUi.reporteT;
import javax.swing.JOptionPane;
import objetos.apuesta;

/**
 *
 * @author andaryus7
 */
public class ingresoResultados extends javax.swing.JFrame {

    /**
     * Creates new form ingresoResultados
     */
    apuesta[] apuestas;
    reporteT reportesT;

    public ingresoResultados(apuesta[] apuestas, reporteT repo) {
        initComponents();
        this.apuestas = apuestas;
        this.reportesT = repo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jPanelDerecho = new javax.swing.JPanel();
        jPanelIzquierdo = new javax.swing.JPanel();
        jPanelCentro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldWin = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField2do = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField3ro = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField4to = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField5to = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField6to = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField7mo = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextField8vo = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextField9no = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField10mo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBackground(new java.awt.Color(0, 153, 255));
        jPanelSuperior.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Hack", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingreso de resultado");
        jPanelSuperior.add(jLabel1, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(0, 153, 255));

        jButtonGuardar.setText("Guardar Resultados");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap(475, Short.MAX_VALUE)
                .addComponent(jButtonGuardar)
                .addGap(125, 125, 125))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButtonGuardar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelDerecho.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanelDerechoLayout = new javax.swing.GroupLayout(jPanelDerecho);
        jPanelDerecho.setLayout(jPanelDerechoLayout);
        jPanelDerechoLayout.setHorizontalGroup(
            jPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelDerechoLayout.setVerticalGroup(
            jPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
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
            .addGap(0, 421, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelIzquierdo, java.awt.BorderLayout.LINE_START);

        jPanelCentro.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setText("Caballo Ganador");

        jLabel3.setText("Segundo Caballo");

        jLabel4.setText("Tercer Caballo");

        jLabel5.setText("Cuarto Caballo");

        jLabel6.setText("Quinto Caballo");

        jLabel7.setText("Sexto Caballo");

        jLabel8.setText("Septimo Caballo");

        jLabel9.setText("Octavo Caballo");

        jLabel10.setText("Noveno Caballo");

        jLabel11.setText("Decimo Caballo");

        javax.swing.GroupLayout jPanelCentroLayout = new javax.swing.GroupLayout(jPanelCentro);
        jPanelCentro.setLayout(jPanelCentroLayout);
        jPanelCentroLayout.setHorizontalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCentroLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField9no))
                    .addGroup(jPanelCentroLayout.createSequentialGroup()
                        .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldWin, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField3ro)
                            .addComponent(jFormattedTextField5to)))
                    .addGroup(jPanelCentroLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField7mo)))
                .addGap(96, 96, 96)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextField2do, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField4to)
                    .addComponent(jFormattedTextField6to)
                    .addComponent(jFormattedTextField8vo)
                    .addComponent(jFormattedTextField10mo))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanelCentroLayout.setVerticalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentroLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldWin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField2do, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jFormattedTextField3ro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jFormattedTextField4to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField5to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField6to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextField7mo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jFormattedTextField8vo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jFormattedTextField9no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jFormattedTextField10mo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        if (!isEmpy() && posiciones()!=null) {
            calcularResultados calcular = new calcularResultados();
            int[] pos = posiciones();
            for (int i = 0; i < pos.length; i++) {
                System.out.println(pos[i]);
            }
            apuestas = calcular.calcular(posiciones(), apuestas);
            reportesT.setTimpoPormedioCalculoResultados(calcular.getTiempoPromedioResutados());
            muestraResultados reporteR = new muestraResultados(apuestas, reportesT);
            reporteR.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Debe llenar todos los espacios");
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    public int[] posiciones() {
        int[] pos1 = null;
        try {
            int uno = Integer.valueOf(jFormattedTextFieldWin.getText());
            int dos = Integer.valueOf(jFormattedTextField2do.getText());
            int tres = Integer.valueOf(jFormattedTextField3ro.getText());
            int cuatro = Integer.valueOf(jFormattedTextField4to.getText());
            int cinco = Integer.valueOf(jFormattedTextField5to.getText());
            int seis = Integer.valueOf(jFormattedTextField6to.getText());
            int siete = Integer.valueOf(jFormattedTextField7mo.getText());
            int ocho = Integer.valueOf(jFormattedTextField8vo.getText());
            int nueve = Integer.valueOf(jFormattedTextField9no.getText());
            int diez = Integer.valueOf(jFormattedTextField10mo.getText());
            int[] pos = {uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez};
            pos1 = pos;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros del 1 al 10");
        }
        return pos1;
    }

    public boolean isEmpy() {
        if (jFormattedTextFieldWin.getText().isEmpty() | jFormattedTextField2do.getText().isEmpty() | jFormattedTextField3ro.getText().isEmpty() | jFormattedTextField4to.getText().isEmpty() | jFormattedTextField5to.getText().isEmpty() | jFormattedTextField6to.getText().isEmpty() | jFormattedTextField7mo.getText().isEmpty() | jFormattedTextField8vo.getText().isEmpty() | jFormattedTextField9no.getText().isEmpty() | jFormattedTextField10mo.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JFormattedTextField jFormattedTextField10mo;
    private javax.swing.JFormattedTextField jFormattedTextField2do;
    private javax.swing.JFormattedTextField jFormattedTextField3ro;
    private javax.swing.JFormattedTextField jFormattedTextField4to;
    private javax.swing.JFormattedTextField jFormattedTextField5to;
    private javax.swing.JFormattedTextField jFormattedTextField6to;
    private javax.swing.JFormattedTextField jFormattedTextField7mo;
    private javax.swing.JFormattedTextField jFormattedTextField8vo;
    private javax.swing.JFormattedTextField jFormattedTextField9no;
    private javax.swing.JFormattedTextField jFormattedTextFieldWin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelDerecho;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
