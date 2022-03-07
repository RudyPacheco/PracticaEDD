/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionUi;

import objetos.apuesta;

/**
 *
 * @author andaryus7
 */
public class calcularResultados {

    private long tiempoT = 0;
    private long tiempoPromedio = 0;

    public apuesta[] calcular(int[] orden, apuesta[] apuestas) {
        tiempoT = 0;
        tiempoPromedio = 0;
        long tiempoI = System.nanoTime();           
        for (int i = 0; i < apuestas.length; i++) {//n
            int ganado = 0;
            int[] temp = apuestas[i].getLista();
            apuesta apuestaT = apuestas[i];
            for (int j = 0; j < 10; j++) {// 1 
                if (orden[j] == temp[j]) {
                    ganado = ganado + (10 - j);
                }
            }
            apuestaT.setGanancia(ganado);
            System.out.println("Ganado " + ganado);
            tiempoT += (System.nanoTime() - tiempoI);
        }
        tiempoPromedio= tiempoT/ apuestas.length;
        return apuestas;

    }

     public long getTiempoPromedioResutados() {
        return tiempoPromedio;
    }
    
    
}
