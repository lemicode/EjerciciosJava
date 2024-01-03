/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author marcovanegas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double sueldo = 0;
        int categoria;
        
        System.out.println("Ingrese el tipo de categoría para calcular el sueldo: ");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if (categoria == 1) {
            sueldo = 15890 + (15980 * 0.10);
        }
        else {
            if (categoria == 2) {
                sueldo = 25630.89;
            }
            else {
                if (categoria == 3) {
                    sueldo = 35560.20 - (35560.20 *0.11);
                }
                else {
                    System.out.println("Debe ingresar un número de categría válido.");
                }
            }
        }
        
        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("El total del sueldo para la categoría No. " + categoria + " es igual a " + sueldo);
        }
        
    }
    
}
