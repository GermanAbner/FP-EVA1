/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica10_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica10_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VELOCIDAD = DISTANCIA / TIEMPO
        // m/s
        double V;
        double d; // Aqui anotas las variables aca nomas con una letra para que no te hagas tantas bolas
        double t;
        
        Scanner input = new Scanner(System.in); //Aqui declaras para que el usuario pueda introducir texto al algoritmo
        
        System.out.println("Para sacar la velocidad introduce la distancia en metros primero: ");
        d = input.nextDouble();
        System.out.println("Ahora introduce el tiempo en segundos: ");
        t = input.nextDouble();
        
        V = d/t;
        
        System.out.println("Ahora la velocidad en m/s seria: ");
        System.out.println(V);
    }
    
}
