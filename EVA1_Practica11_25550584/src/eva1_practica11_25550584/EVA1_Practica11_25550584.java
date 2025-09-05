/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica11_25550584;

/**
 *
 * @author miria
 */
public class EVA1_Practica11_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radio = 5;  //declaramos e inicializamos
        boolean resu;
        //OPERACIONES LOGICAS: Comparaciones
        //RESULTADO: VERDADERO FALSO      
        resu = radio > 0;
        System.out.println("radio (5) > 0 -->");
        System.out.println(resu);
        
       resu = radio < 0; //Radio menos que cero
        
        System.out.println("Radio (5) < 0 -->");
        System.out.println(resu);
        
        resu = radio == 0; //radio igual que cero
        System.out.println("radio (5) == 0 -->");
        System.out.println(resu);
        
        resu = radio != 0; //radio es diferente que cero
        System.out.println("radio (5) != 0 -->");
        System.out.println(resu);
    }
    
}
