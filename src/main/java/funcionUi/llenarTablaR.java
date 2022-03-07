/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionUi;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import objetos.apuesta;

/**
 *
 * @author andaryus7
 */
public class llenarTablaR {
   
    public void reporteResultados(apuesta[] apuestas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        //Anadir columnas
        modelo.addColumn("Nombre Apostador");
        modelo.addColumn("Monto Apostado");
        modelo.addColumn("Puntos Ganados");
        for (int i = 0; i < apuestas.length; i++) {
            apuesta tmp = apuestas[i];
            if (tmp!=null) {
                modelo.addRow(new Object[]{tmp.getNombre(),tmp.getMonto(),tmp.getGanancia()});
            }
        }
    }

  

}
