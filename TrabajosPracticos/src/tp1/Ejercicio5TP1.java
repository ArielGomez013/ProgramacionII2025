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
public class Ejercicio5TP1 {

     public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);

         System.out.print("Ingrese la cordenada del punto");
         System.out.print(" x= ");
         int x=entrada.nextInt();
         System.out.print("y= ");
         int y=entrada.nextInt();
         
         if(x>0 && y>0){
             System.out.print("1°Cuadrante");
         }
         else if(x<0 && y>0){
             System.out.print("2°Cuadrante");
         }
         else if(x<0 && y<0){
             System.out.print("3°Cuadrante");
         }
         else if(x>0 && y<0){
             System.out.print("4°Cuadrante");
         }
         else if(x==0 && y==0){
             System.out.print("Esta en el eje de cordenadas (0,0)");
    }  
         
    }
}
