/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practtica19_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practtica19_25550584 {

    final static String EDAD0 = "18";
    final static String INE0 = "1";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String edad1, ine1;
             
        Scanner input = new Scanner(System.in);
        
        System.out.println("*********************************");
        System.out.println("**********Bienvenido*************");
        System.out.println("*********************************");
        System.out.println();
        System.out.println();
        System.out.println("Edad: ");
        edad1 = input.nextLine();
        System.out.println("Tienes INE?) Si=1/No=0 ");
        ine1 = input.nextLine();
        
        if (edad1.equals(EDAD0)){ // USAMOS AND == &&, MAYOR DE EDAD Y TENER CREDENCIAL
            
            if (ine1.equals(INE0)){
            System.out.println("Si puedes pasar ");
           
       }else{
            
            System.out.println("TE FALTA LA INE!!");
        }                                                      
        }else{
            
            System.out.println("ERES MENOR DE EDAD!!");
        }
       }
       }

    