/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica16_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica16_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Captura el numero del dia (1 a 7) para representar el dia de la semana");
        dia = captu.nextInt();
        
        if (dia == 1){
            System.out.println("Domingo");
        }else if (dia == 2){
            System.out.println("Lunes");
        }else if (dia == 3){
            System.out.println("Martes");
        }else if (dia == 4){
            System.out.println("Miercoles");
        }else if (dia == 5){
            System.out.println("Jueves");
        }else if (dia == 6){
            System.out.println("Viernes");
        }else if (dia == 7){
            System.out.println("Sabado");
        }else{
            System.out.println("Numero no valido");
        }

    }
    
}
