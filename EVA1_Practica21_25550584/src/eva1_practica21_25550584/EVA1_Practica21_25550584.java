/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica21_25550584;

/**
 *
 * @author miria
 */
public class EVA1_Practica21_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DIFERENTES OPERACIONES
        //POTENCIA
        
        int valor = 2, expo= 3;
        double resu;
        
        resu = Math.pow(valor, expo);
        System.out.print("Cual es el resultado de elevar 2 al cubo? ");
        System.out.print(resu);
        
        System.out.println();
        
        // RAIS CUADRADA  
        
        int valor2 = 100;
        double resu2;
        
        resu2 = Math.sqrt(valor2);
        
        System.out.println("Raiz cuadrada de 100 = ");System.out.print(valor2);
        System.out.println();
        
        // OTRAS RAICES
        
        int valor3 = 125;
        double resu3;
        resu3 = Math.pow(valor3,1.0/3.0); // CUANDO HAGAN DIVICIONES SI QUIEREN EL RESULTADO EXACTO DIVIDE ENTRE PUNTO DECIMAL PORQ LUEGO TE DA ENTERO Y M AGUITO :c
        System.out.println("Cual es la raiz cubica de 125? ");
        System.out.println(resu3);
        
        // DIVISION EXACTA
        int num1 = 2024, num2 = 4;
        int residuo;
        
        residuo = num1 % num2; // calculo del residuo
        System.out.println("2024 / 4 el residuo es ");
        System.out.println(residuo);
        
        
    }
    
}
