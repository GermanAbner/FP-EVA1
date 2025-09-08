/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica13_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica13_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Este es un verificador de edades, porfavor adjunta tu ano de nacimiento en la siguiente pregunta");
        System.out.println("En que ano naciste?");
        califa = captu.nextInt();
        //Estructura de control IF
        if(califa <= 2007){
            System.out.println("Si puedes comprar bebidas alcoholicas");
        }else
//Bloque falso --> OPCIONAL  
            System.out.println("naaaaaaambree papa");
    }
    
}
