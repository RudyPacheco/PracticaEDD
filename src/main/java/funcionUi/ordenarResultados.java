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
public class ordenarResultados {

    private long tiempoPuntos = 0;
    private long tiempoAlfabeticamente = 0;
    private long tiempoPromedioAlfabeticamente = 0;
    private long tiempoPromedioPuntos = 0;

    public apuesta[] ordenarPorPuntos(apuesta[] apuestas) {
        this.tiempoPuntos = 0;
        this.tiempoPromedioPuntos = 0;
        apuesta aux;
        int posAux;
        for (int i = 0; i < apuestas.length; i++) {                                 //n
            long tiempoI = System.nanoTime();
            posAux = i;
            aux = apuestas[i];
            while ((posAux > 0) && (apuestas[posAux - 1].getGanancia() < aux.getGanancia())) {  //n
                apuestas[posAux] = apuestas[posAux - 1];
                posAux--;
            }
            apuestas[posAux] = aux;
            tiempoPuntos += (System.nanoTime() - tiempoI);
        }
        this.tiempoPromedioPuntos = tiempoPuntos / apuestas.length;
        return apuestas;
    }

    public apuesta[] ordenarAlfabeticamente(apuesta[] apuestas) {
        this.tiempoAlfabeticamente = 0;
        this.tiempoPromedioAlfabeticamente = 0;
        apuesta aux;
        int posAux;
        for (int i = 0; i < apuestas.length; i++) {
            long tiempoI = System.nanoTime();
            posAux = i;
            aux = apuestas[i];
            while ((posAux > 0) && (apuestas[posAux - 1].getNombre().compareTo(aux.getNombre()) > 0)) {
                apuestas[posAux] = apuestas[posAux - 1];
                posAux--;
            }
            apuestas[posAux] = aux;
            tiempoAlfabeticamente += (System.nanoTime() - tiempoI);
        }
        this.tiempoPromedioAlfabeticamente = tiempoAlfabeticamente / apuestas.length;

        return apuestas;
    }

    private void reiniciarTiempo() {
        this.tiempoAlfabeticamente = 0;
        this.tiempoPuntos = 0;
        this.tiempoPromedioAlfabeticamente = 0;
        this.tiempoPromedioPuntos = 0;
    }

    public long getTiempoOrdenamientoAlfabetico() {
        return tiempoPromedioAlfabeticamente;
    }

    public long getTiempoOrdenamientoPuntos() {
        return tiempoPromedioPuntos;
    }

}
