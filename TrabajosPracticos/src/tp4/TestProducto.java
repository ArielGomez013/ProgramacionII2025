/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;
//import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
/**
 *
 * @author ariel
 */
public class TestProducto {
    
    public static void main(String[] args) {
        Producto[]productos={
        new Producto("Papas",2000,35),
        new Producto("Azucar",1000,30),
        new Producto("Galletas",750,50),
        new Producto("Fideos",600,40),
        new Producto("Aceite",3000,20)
        };
      //  Arrays.sort(productos);
       // System.out.println(Arrays.toString(productos));
        
        Arrays.sort(productos, new ComparatorNombre());
        System.out.println(Arrays.toString(productos));
        
       
    }
    
}
