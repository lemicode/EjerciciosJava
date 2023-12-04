/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalif;

/**
 *
 * @author marcovanegas
 */
public class CondicionalIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 10;
        
        if (num1 > num2) {
            System.out.println("El num1 es mayor a num2");
        } 
        else {            
            if (num1 == num2) {
                System.out.println("Son iguales");
            }
            else {
                System.out.println("El num2 es mayor al num1");
            }
        }
        
    }
    
}
