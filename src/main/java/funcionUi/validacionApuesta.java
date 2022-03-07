/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionUi;

import interfazUi.ingresoResultados;
import objetos.apuesta;

/**
 *
 * @author andaryus7
 */
public class validacionApuesta {

    private apuesta apuestas[];
    private int size = 0;
    private long tiempoT = 0;
    private long tiempoPromedioVerificacion = 0;
    private String rechazadas = "---apuestas rechazadas---:     \n";

    public apuesta[] validarApuestas(apuesta[] apuestas) {
        long tiempoInicial = System.nanoTime();
        this.apuestas = apuestas;
        size = apuestas.length;
        for (int i = 0; i < apuestas.length; i++) {//n
            int[] posiciones = new int[10];
            for (int j = 0; j < 10; j++) {// 1
                if (apuestas[i].getLista()[j]>=0 && apuestas[i].getLista()[j]<=10) {
                    if (posiciones[apuestas[i].getLista()[j] - 1] == apuestas[i].getLista()[j]) {
                        System.out.println("Numero repetido" + (apuestas[i].getLista()[j]));
                        rechazadas += "Numero repetido " + (apuestas[i].getLista()[j]) + "en apuesta " + (i + 1);
                        apuestas[i] = null;
                        size--;
                        break;
                    } else {
                        posiciones[apuestas[i].getLista()[j] - 1] = apuestas[i].getLista()[j];
                        System.out.println("no repetido");
                    }
                }else{
                    rechazadas += "Numero invalido " + (apuestas[i].getLista()[j]);
                    apuestas[i] = null;
                     break;
                }
                    
            }
            tiempoT += (System.nanoTime() - tiempoInicial);
        }
        tiempoPromedioVerificacion = tiempoT / apuestas.length;
        return apuestas;

    }

    public apuesta[] limpiarApuestas(apuesta[] apuestas) {
        apuesta[] apuestasL = new apuesta[size];
              int pos = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i] != null) {
                apuestasL[pos] = apuestas[i];
                pos++;
            }
        }

        return apuestasL;
    }

    public long getTiempoPromedio() {
        return tiempoPromedioVerificacion;
    }
    
    public String getRechazos(){
        return rechazadas;
    }

}
