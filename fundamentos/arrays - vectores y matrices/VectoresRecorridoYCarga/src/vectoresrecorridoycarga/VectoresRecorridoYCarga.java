/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoresrecorridoycarga;

import java.util.Scanner;

/**
 *
 * @author marcovanegas
 */
public class VectoresRecorridoYCarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaración
        int vector [] = new int [4];
        
        // Asignación (manual)
        /*vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 157;*/
        
        // Asignación (por teclado)
        Scanner teclado = new Scanner (System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el indice " + i);
            vector[i] = teclado.nextInt();
        }
        
        // Recorrido
        for(int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("----------------------");
        }
        
    }
    
}
