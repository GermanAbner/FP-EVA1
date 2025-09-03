/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica9_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA1_Practica9_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre completo ");
        //Captura de datos asi bien aca :O
         
    //UNA VES PUESTO ESE COMANDO YA SE PUEDE UTILIZAR TODO EL TIEMPO OMGGGGGGG
         nombre = input.nextLine(); // Esto captura el nombre importante www echale ganas mijo <3333333
         System.out.println("Introduce tu edad: ");
         edad = input.nextInt();
         System.out.println("Introduce tu promedio de a preparatoria: ");
         promedio = input.nextDouble();
                          
         System.out.println("El nombre es: ");
         System.out.print(nombre); //Echale ganas w esto lo vas a usar 
         System.out.println();
         System.out.println("Tu edad es: ");
         System.out.println(edad);
         System.out.println("El promedio es: ");
         System.out.println(promedio);
    }
    
}
