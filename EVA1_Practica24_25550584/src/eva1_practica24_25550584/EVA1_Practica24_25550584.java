/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica24_25550584;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author miria
 */
public class EVA1_Practica24_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int usuario, moneda;
      Random random = new Random();
      
      System.out.println("Aguila(1) o sello(0)? (1/0)");
      Scanner input = new Scanner(System.in);
      usuario = input.nextInt();
      
      moneda = random.nextInt(2);
      System.out.println("La cara de la moneda es: " + (moneda == 1 ? "Aguila" : "Sello"));
      
      if (usuario == 1 && moneda == 1)
          System.out.println("NADIE GANA");
      else if (usuario == 0 && moneda == 1)
          System.out.println("PERDISTE");
      else if (usuario == 1 && moneda == 0)
          System.out.println("Ganaste");
      else 
          System.out.println("NADIE GANA");
      input.close();
      
    }
    
}
