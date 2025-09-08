/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class TestCalificaciones {
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese su calificacion: ");
        
            try{
            int califIngresada=entrada.nextInt();
            if(califIngresada<0 || califIngresada>10){
            throw new CalificationException ("Valor ingresado invalido, no puede haber una nota menor que 0 o mayor que 10");
        }
        Calificaciones calificacion1= new Calificaciones(califIngresada);
        calificacion1.estudianteAprobo();
        System.out.println("Programa terminado");
    }
        catch(CalificationException e){
           System.out.println("Error: "+e.getMessage());
        }
        catch(InputMismatchException e){
           System.out.println("Error: No puede ingresar letras o caracteres especiales");
        }
           
    }
}

