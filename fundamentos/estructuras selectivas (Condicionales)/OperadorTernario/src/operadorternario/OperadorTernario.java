/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

import java.util.Scanner;

/**
 *
 * @author marcovanegas
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double promedio;
        String condicionFinal;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingrese el promedio general del alumno: ");
        promedio = teclado.nextDouble();
        
        condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
        
        System.out.println("La condición final del alumno es: " + condicionFinal);
        
    }
    
}
