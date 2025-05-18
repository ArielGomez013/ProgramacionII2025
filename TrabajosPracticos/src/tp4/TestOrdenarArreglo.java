/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ariel
 */
public class TestOrdenarArreglo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cuantos numeros desea tener su arreglo?");
        int cantidad=entrada.nextInt();
        System.out.println("Ingrese el/los numeros para su arreglo: ");
        int[]numero=new int[cantidad];
        for(int i=0;i<numero.length;i++){
            numero[i]=entrada.nextInt();
        }
        OrdenarArreglo arreglo=new OrdenarArreglo(numero);
        arreglo.mostrarArreglo();
        arreglo.metodoBubbleSort();
        System.out.println("Arreglo ordenado de menor a mayor:");
        arreglo.mostrarArreglo();
        
        //Arrays.sort(numero);
        //System.out.println(Arrays.toString(numero));
    }
    
}
//Al comparar el rendimiento de Bubble Sort con Arrays.sort(), se puede ver que Bubble Sort es más lento, especialmente con arreglos grandes. Esto es porque Bubble Sort compara y mueve uno por uno en cada pasada, mientras que Arrays.sort() usa un algoritmo mucho más optimizado que encuentra la forma más rápida de ordenar sin tener que revisar todo tantas veces.

