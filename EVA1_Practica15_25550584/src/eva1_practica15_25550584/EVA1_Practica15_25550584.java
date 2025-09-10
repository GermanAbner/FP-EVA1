/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica15_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica15_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Hola que tal, brindame un numero porfavor");
        num1 = captu.nextDouble();
        System.out.println("Ahora brindame otro numero :D");
        num2 = captu.nextDouble();
        
        if (num1 > num2){
        
        System.out.print("El numero ");
        System.out.print(num1);
        System.out.println("es el mayor entre los 2 numeros que me brindaste");
        
        }else{
            if(num2 > num1){
        
        System.out.print("El numero");
        System.out.print(num2 );
        System.out.print("  es el mayor entre los 2 numeros que me brindaste");
        System.out.println();
            }else{
                
                System.out.println("Los numeros son iguales");
            }
        
    }
        

       
    }
    
}
