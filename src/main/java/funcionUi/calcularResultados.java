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
    
    
    public void calcular(int[] orden,apuesta[] apuestas){
        int ganado=0;
        for (int i = 0; i < apuestas.length; i++) {//n
            
            int[]temp = apuestas[i].getLista();
            apuesta apuestaT= apuestas[i];
            
            for (int j = 0; j < 10; j++) {// 1 
                if (orden[j]==temp[j]) {
                    ganado = ganado + (10-j);
                }
            }
            apuestaT.setGanancia(ganado);
            System.out.println("Ganado "+ganado);
            
        }
        
        
    }
    
    
    
}
