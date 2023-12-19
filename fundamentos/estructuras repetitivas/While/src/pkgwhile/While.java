/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author marcovanegas
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Controlado por contador
        
        int cont = 0;
        
        while (cont <= 10) {            
            System.out.println("Estoy en la vuelta " + cont);
            cont++;
        }
        
        // Controlado por centinela
        
        boolean centinela = true;
        
        while (centinela) {            
            System.out.println("El valor de la bandera es " + centinela);
            centinela = false;
        }
        
    }
    
}
