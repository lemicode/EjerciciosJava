/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author marcovanegas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 35;
        int num2 = 20;
        int aux;
        
        System.out.println("---Antes---");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        aux = num2;
        num2 = num1;
        num1 = aux;
        
        System.out.println("---Después---");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        
    }
    
}
