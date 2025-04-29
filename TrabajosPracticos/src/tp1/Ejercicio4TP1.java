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
public class Ejercicio4TP1 {

     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese el dia: ");
        int dia=entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes=entrada.nextInt();
        System.out.print("Ingrese el anio: ");
        int anio=entrada.nextInt();
        System.out.println(+dia+"-"+mes+"-"+anio);
        
        if(mes>0 && mes<=3){
            System.out.println("Primer trimestre del anio");
        }
        else if(mes>=4 && mes <=6){
            System.out.println("Segundo trimestre del anio");
        }
        else if(mes>=7 && mes <=9){
            System.out.println("Tercer trimestre del anio");
        }
        else if(mes>=10 && mes <=12){
            System.out.println("Cuarto trimestre del anio");
        }
        else{
            System.out.println("Valor incorrecto");
        }
    }
    
}
