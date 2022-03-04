/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionUi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import objetos.apuesta;

/**
 *
 * @author andaryus7
 */
public class leerArchivo {
 
    
     public apuesta[] leerFichero(File archivo, apuesta[] apuestas) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            apuestas = aumentarTamañoArreglo(apuestas);
            ingresarApuesta(nuevaApuesta(apuestasString(linea)), apuestas);
            //agregar orden de entrada de caballos en el arregolo general
            //text.append(linea+"\n");
            System.out.println("Apuesta ingresada "+linea);
        }
        fr.close();
        return apuestas;
    }
    
     private String[] apuestasString(String linea) {
        return linea.split(",");
    }
     
      

       private int[] separarPos(String[] apuestaString) {
        int posiciones[] = new int[10];
        for (int i = 0; i < posiciones.length; i++) {
            try {
                posiciones[i] = Integer.parseInt(apuestaString[i + 2]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "esta posicion de entrada es invalida"+posiciones[i]);
            }
        }
        return posiciones;
    }
       
   private apuesta nuevaApuesta(String[] apuestaString) {
        return new apuesta( apuestaString[0],Double.parseDouble(apuestaString[1]),separarPos(apuestaString));
    }
   
   
   
     
    public void ingresarApuesta(apuesta apuesta, apuesta[] apuestas) {
        apuestas[apuestas.length-1] = apuesta;
    }

    
    public apuesta[] aumentarTamañoArreglo(apuesta[] apuestas) {
        if (apuestas == null) {
            return new apuesta[1];
        } else {
            apuesta[] aumentado = new apuesta[apuestas.length + 1];
            System.arraycopy(apuestas, 0, aumentado, 0, apuestas.length);
            return aumentado;
        }

    }
    
}
