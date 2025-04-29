/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ElLibroE4Tp2;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class LibroE4 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Libro miLibro= new Libro("El senior de los Anillos","J.R.R Tolkien","978-0345339683","disponible");
        miLibro.mostrarInformacion();
        System.out.println("Quiere alquilar el libro?");
        System.out.println("1.Si");
        System.out.println("2.No");
        
        int opcion=entrada.nextInt();
        
        if(opcion==1){
           miLibro.prestar();
           miLibro.mostrarInformacion();
           System.out.println("Quiere devolver el libro?");
           System.out.println("1.Si");
           System.out.println("2.No");
           int opciones=entrada.nextInt();
           if(opciones==1){
               miLibro.devolver();
               miLibro.mostrarInformacion();
           }
           else if(opciones==2){
            System.out.println("Programa terminado");
           }
           else{
            System.out.println("Error, ingrese la opcion 1 o 2");
            }
    }
        else if(opcion==2){
            System.out.println("Programa terminado");
        }
        else{
            System.out.println("Error, ingrese la opcion 1 o 2");
        }
        entrada.close();
    }
    
}
