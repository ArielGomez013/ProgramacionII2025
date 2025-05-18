/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class TestNumerosEnteros {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        do{
        System.out.println("-----Menu------");
        System.out.println("1.Ingresar un arreglo");
        System.out.println("2.Salir");
        opcion=entrada.nextInt();
        if(opcion==1){
        System.out.println("Cuanto numeros desea tener su arreglo?");
        int cantidad=entrada.nextInt();
        System.out.println("Ingrese el/los numero/s para mostrarlos como array");
        
        int[]numeros=new int[cantidad];
        
        for(int i=0;i<cantidad;i++){
            numeros[i]=entrada.nextInt();
        }
        
        NumerosEnteros numero= new NumerosEnteros(numeros);        
        
        
        numero.mostrarArreglo();
        System.out.println("La suma de todos los elementos es de: "+numero.sumarElementos());
        System.out.println("El elemento que tiene menor valor es: "+numero.encontrarMin());
        System.out.println("El elemento que tiene meyor valor es: "+numero.encontrarMax());
        numero.invertirOrden();
        
        }
        else if(opcion==2){
            System.out.println("Programa Terminado");
        }
        else{
            System.out.println("Error, ingrese 1 o 2");
        }
        }while(opcion!=2);        
    }
    
}
