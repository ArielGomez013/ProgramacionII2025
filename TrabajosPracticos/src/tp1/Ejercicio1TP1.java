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
public class Ejercicio1TP1 {

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la nota: ");
        
        int nota=entrada.nextInt();
         
        
        entrada.close();
        if(nota<4){
            System.out.print("Desaprobado");
        }
        if(nota>=4 && nota<10){
            System.out.print("Aprobado"); 
        }
        if(nota==10){
        System.out.print("Sobresaliente");
        }
    }
}
