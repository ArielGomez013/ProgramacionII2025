/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticon1;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejercicio2TP1 {

   public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
    
        System.out.print("Ingrese la nota del primer parcial: ");
        int nota1=entrada.nextInt();
        System.out.print("Ingrese la nota del segundp parcial: ");
        int nota2=entrada.nextInt();
        System.out.print("Ingrese la nota del tercer parcial: ");
        
        int nota3=entrada.nextInt();
        int notafinal=(nota1+nota2+nota3)/3;
        
        if(notafinal<8){
            System.out.print("No esta promocionado");
        }
        if(notafinal>=8){
            System.out.print("Promocionado");
        }
        
       
    }
    
}
