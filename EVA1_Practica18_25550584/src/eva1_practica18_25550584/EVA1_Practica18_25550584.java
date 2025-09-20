/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica18_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica18_25550584 {
   
    final static String USER = "German";
    final static String PASSWORD = "1234";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Usuario, Contra;
        Scanner input = new Scanner(System.in);
        
        System.out.println("*********************************");
        System.out.println("************WELCOME**************");
        System.out.println("*********************************");
        System.out.println();
        System.out.println();
        System.out.println("Usuario: ");
        Usuario = input.nextLine();
        System.out.println("Contrasena: ");
        Contra = input.nextLine();
        
        if (Usuario.equals(USER)){ //COMPARAR CADENAS
            
        if (Contra.equals(PASSWORD)){
                   
            System.out.println("RIGHT!!!");
            
        }else{
            
            System.out.println("WRONG!!");
        }
        }else{
            
            System.out.println("WRONG!!");
        }
       }
        
    }
    

