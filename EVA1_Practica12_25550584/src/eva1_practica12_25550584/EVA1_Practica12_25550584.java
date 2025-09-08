/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica12_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica12_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la calificacion ");
        califa = captu.nextInt();
        //Estructura de control IF
        if(califa >= 70){
            System.out.println("ACREDITADO!!");
        }else
//Bloque falso --> OPCIONAL  
            System.out.println("NO ACREDITADO");
            
        }
    }
    

