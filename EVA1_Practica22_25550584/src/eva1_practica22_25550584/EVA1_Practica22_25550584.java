/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica22_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica22_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       int year, resi4, resi100, resi400;
       System.out.println("Año de verificacion");
       year = captu.nextInt();
       resi4 = year % 4;
       resi100 = year % 100;
       resi400 = year %400;
       if(resi4 == 0) // DIvision exacta entre 4
           if(resi100 == 0) //puede ¿?
               if(resi400 == 0){
                System.out.println("El año ");
                System.out.print(year);
                System.out.print(" es BISIESTO");
                             
       }else{
                System.out.println("El año ");
                System.out.print(year);
                System.out.print("NO es BISIESTO");
       }
       }
    
       }
