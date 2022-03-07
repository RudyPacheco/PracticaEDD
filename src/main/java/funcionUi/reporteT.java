/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionUi;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andaryus7
 */
public class reporteT {

    private double timpoPormedioVerificacion;
    private double timpoPormedioOrdenamientoN;
    private double timpoPormedioOrdenamientoP;
    private double timpoPormedioCalculoResultados;

    public double getTimpoPormedioVerificacion() {
        return timpoPormedioVerificacion;
    }

    public void setTimpoPormedioVerificacion(double timpoPormedioVerificacion) {
        this.timpoPormedioVerificacion = timpoPormedioVerificacion;
    }

    public double getTimpoPormedioOrdenamientoN() {
        return timpoPormedioOrdenamientoN;
    }

    public void setTimpoPormedioOrdenamientoN(double timpoPormedioOrdenamientoN) {
        this.timpoPormedioOrdenamientoN = timpoPormedioOrdenamientoN;
    }

    public double getTimpoPormedioOrdenamientoP() {
        return timpoPormedioOrdenamientoP;
    }

    public void setTimpoPormedioOrdenamientoP(double timpoPormedioOrdenamientoP) {
        this.timpoPormedioOrdenamientoP = timpoPormedioOrdenamientoP;
    }

    public double getTimpoPormedioCalculoResultados() {
        return timpoPormedioCalculoResultados;
    }

    public void setTimpoPormedioCalculoResultados(double timpoPormedioCalculoResultados) {
        this.timpoPormedioCalculoResultados = timpoPormedioCalculoResultados;
    }

    public void reportesTiempo(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        //Anadir columnas
        modelo.addColumn("T.P. calculo Resultados");
        modelo.addColumn("T.P. Verificacion");
        modelo.addColumn("T.P. Ordenamiento Nom");
        modelo.addColumn("T.P. Ordenamiento Punt");
        modelo.addRow(new Object[]{"Seg " + (this.timpoPormedioCalculoResultados / (9 * Math.pow(10, 9))), "Seg " + (this.timpoPormedioVerificacion / (9 * Math.pow(10, 9))), "Seg " + (this.timpoPormedioOrdenamientoN / (9 * Math.pow(10, 9))), "Seg " + (this.timpoPormedioOrdenamientoP / (9 * Math.pow(10, 9)))});
    }

}
