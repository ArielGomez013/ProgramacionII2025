/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class TestCalculadora {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Calculadora calculadora= new Calculadora();
        
        System.out.println("Ingrese el primer numero");
                int numero1=entrada.nextInt();
                calculadora.setNum1(numero1);
                System.out.println("Ingrese el segundo nummero");
                int numero2=entrada.nextInt();
                calculadora.setNum2(numero2);
                
        System.out.println("Ingrese la operacion a realizar");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("--------");
        
        int opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                   double resultadoSuma= calculadora.sumar();
                   System.out.println("La suma es de: "+resultadoSuma);
                   break;
            case 2:
                   double resultadoResta=calculadora.resta();
                   System.out.println("La resta es de: "+resultadoResta);
                   break;
            case 3:
                   double resultadoMultiplicacion=calculadora.multiplicacion();
                   System.out.println("La multiplicacion es de: "+resultadoMultiplicacion);
                   break; 
            case 4:
                   double resultadoDivision=calculadora.division();
                   System.out.println("La division es de: "+resultadoDivision);
                   break;
            default:
                   System.out.println("Error, ingrese del 1 al 4 ");
        }
        entrada.close();
    }
    
}
