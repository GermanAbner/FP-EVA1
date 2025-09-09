/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica14_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica14_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total;
        double pagar;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Hola, Buenas Tardes");
        System.out.print("Ya concluiste tu estadia en la tienda, porfavor brindame el total de precio de sus articulos ");
        total = captu.nextDouble();
        
        if (total > 1000);
        
        pagar = total - (total*.15);
                   
        System.out.println("El total a pagar si es que se acredito el descuento seria: ");
        System.out.println(pagar);
        
    }
    
}
