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
public class validacionApuesta {

    private apuesta apuestas[];
    private int posiciones[];

    public void validarApuestas(apuesta[] apuestas, int pos[]) {
        this.apuestas = apuestas;
        this.posiciones = pos;
        
        for (int i = 0; i < apuestas.length; i++) {// n
            int[] temp;
            temp = apuestas[i].getLista();
            int[] temp2 =apuestas[i].getLista();
            for (int j = 0; j < temp.length; j++) {
                
            }
            
//ordenarBurbuja(temp);

//            int contador;
//            int aux = temp[0];
//            for (int j = 0; j <10; j++) {//1
//                if (aux==temp[j]) {
//                    System.out.println("numero repetido");
//                }else{
//                    aux=temp[j];
//                }
//            }

        }

//         for (int i = 0; i < pos.length; i++) {//n
//             
//             int j=0;
//             int aux=pos[j];//1
//             int iteraciones=0;//1
//             
//             
//             if (aux==pos[j+1]) {
//                 System.out.println("NUmeros repetidos apuesta ");
//             }else{
//                 j++;
//             }
//             if (iteraciones==10) {
//                 System.out.println("Apuesta valida ");
//             }
//             
//             
//         }
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int auxiliar;
        for (int i = 0; i < (arreglo.length - 1); i++) { //ya no es necesario que de todas las vueltas ...
            for (int j = 0; j < (arreglo.length - 1); j++) { //... para comprobar (y tambien tira error xd)
                if (arreglo[j] > arreglo[j + 1]) { //si numeroActual > numeroSiguiente
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1]; //intercambiar valores de los elementos, se va desplazando
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }

}
