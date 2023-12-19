/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalswitch;

/**
 *
 * @author marcovanegas
 */
public class CondicionalSWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dia = 5;
        String nombreDia;
        
        switch (dia) {
            case 1: nombreDia="Lunes";
            break;
            case 2: nombreDia="Martes";
            break;
            case 3: nombreDia = "Miércoles";
            break;
            case 4: nombreDia = "Jueves";
            break;
            case 5: nombreDia= "Viernes";
            break;
            case 6: nombreDia= "Sábado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia = "Número de día inválido";
            break;
        }
        
        System.out.println("El día de la semana es: " + nombreDia);
        
    }
    
}
