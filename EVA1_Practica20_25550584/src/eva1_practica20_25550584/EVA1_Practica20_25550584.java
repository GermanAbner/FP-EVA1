/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva1_practica20_25550584;

import java.util.Scanner;

public class EVA1_Practica20_25550584 {

    public static void main(String[] args) {
    
        int califa;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("****************************");
        System.out.println("**Sistema de Calificaiones**");
        System.out.println("****************************");
        
        System.out.println("Hola que tal, en este programa te vamos a brindar tu calificacion en formato del Chuco");
        
        System.out.println("Brindame tu calificacion: ");
        
        califa = input.nextInt();
        
        if (califa >=90 && califa <= 100)
            System.out.println("Felicidades tu calificacion es A");
        else if (califa >=80 && califa <= 89){
            System.out.println("Felicidades tu calificaion es B");
        }else if (califa >=70 && califa <= 79){
            System.out.println("Felicidades tu calificaion es D");
        }else if (califa >=60 && califa <= 69){
            System.out.println("Felicidades tu calificaion es E");
        }else if (califa >=0 && califa <= 59){
            System.out.println("Felicidades tu calificaion es F");
        }
    }}

// CUANDO EN EL BLOQUE DE IF SOLO ES UNA INSTRUCCION NO NECESITA LLAVE
