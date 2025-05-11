/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class TestInteresCompuesto {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        //InteresCompuesto inversion1= new InteresCompuesto(10000,5,6);
     
        System.out.println("Ingrese su inversion: ");
        int inversion=entrada.nextInt();
        System.out.println("Ingrese la tasa anual(con coma)");
        double tasaAnual=entrada.nextDouble()/100;
        System.out.println("Ingrese los anios");
        int anios=entrada.nextInt();
        
        InteresCompuesto inversion1=new InteresCompuesto(inversion,tasaAnual,anios);
        //System.out.println("El interes compuesto es de:"+String.format("%.2f",inversion1.formula()));
        System.out.println("El interes compuesto es de:"+String.format("%.2f",inversion1.formula()));
        
        long redondeo=Math.round(inversion1.formula());
        System.out.println("El valor exacto es: "+redondeo);
        System.out.println("Conclusion, redondea si el numero que esta despues de la coma es mayor que 5, si no, lo deja como esta");
        
        
    }
    
}
