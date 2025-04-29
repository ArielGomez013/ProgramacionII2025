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
public class Ejercicio6TP1 {

     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de triangulos: ");
        
        int cantidad=entrada.nextInt();
        int i;
        int cantEquilatero=0;
        int cantIsosceles=0;
        int cantEscaleno=0;
        
        for(i=0;i<cantidad;i++){
            System.out.print("Ingrese los lados del triangulo: ");
         int lado1=entrada.nextInt();
         int lado2=entrada.nextInt();
         int lado3=entrada.nextInt();
        
         
        if((lado1==lado2)&&(lado1==lado3)){
                System.out.println("Es equilatero");
                cantEquilatero++;
        }
        else if(lado1==lado2||lado1==lado3||lado2==lado3){     
                System.out.println("Es Isosceles");
                cantIsosceles++;
        }
        else{
                System.out.println("Es Escaleno");
                cantEscaleno++;
            }
        }
        if((cantEquilatero<=cantIsosceles) &&(cantEquilatero<=cantEscaleno)){
            System.out.print("Equilatero es el que tiene menos cantidad de triangulos");
        }
        else if((cantIsosceles<=cantEquilatero)&&(cantIsosceles<=cantEscaleno)){
            System.out.print("Isosceles es el que tiene menos cantidad de triangulos");
        }
        else if((cantEscaleno<=cantEquilatero)&&(cantEscaleno<=cantIsosceles)){
            System.out.print("Escaleno es el que tiene menos cantidad de triangulos");
        }
        else {
    
              if (cantEquilatero == cantIsosceles) {
                 System.out.print("Equilátero e Isósceles tienen la misma cantidad menor de triángulos");
              } 
              else if (cantEquilatero == cantEscaleno) {
                 System.out.print("Equilátero y Escaleno tienen la misma cantidad menor de triángulos");
              }
              else if (cantIsosceles == cantEscaleno) {
                 System.out.print("Isósceles y Escaleno tienen la misma cantidad menor de triángulos");
    }
}    
        entrada.close();
        }
    
    }