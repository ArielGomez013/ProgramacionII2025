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
public class Ejercicio3TP1 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Ingrese el numero: ");
        int num=entrada.nextInt();
        
        if(num>=10){
            System.out.print("El numero tiene dos digitos");
        }
        if(num<10){
            System.out.print("El numero tiene un digito");
        }    
    }
    
}
