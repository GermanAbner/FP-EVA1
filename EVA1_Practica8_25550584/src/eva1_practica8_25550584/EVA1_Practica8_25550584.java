/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica8_25550584;

/**
 *
 * @author miria
 */
public class EVA1_Practica8_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Faren;
        double Cels;
        double Total;        
        
        Faren = 100;
        Cels = 5*(Faren-32);
        Total = Cels/9;
        
        System.out.println("Convirtiendo Grados Fahrenheit a Grados Celsius ");
        System.out.println("Los grados fahrenheit serian 74 ");
        System.out.print("Los grados convertidos serian = ");
        System.out.print(Total);
        System.out.println();
    }
    
}
