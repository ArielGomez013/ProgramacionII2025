/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;
//import java.util.Arrays;
//import java.util.Collection;
import java.util.Comparator;
import java.util.*;
/**
 *
 * @author ariel
 */
public class TestProducto2 {

    public static void main(String[] args) {
        List<Producto2> productos1= new ArrayList<>();
        productos1.add(new Producto2("Papas",2000,35));
        productos1.add(new Producto2("Azucar",1000,30));
        productos1.add(new Producto2("Galletas",750,50));
        productos1.add(new Producto2("Fideos",600,40));
        productos1.add(new Producto2("Aceite",3000,20));
        
        Collections.sort(productos1);
        System.out.println("Ordenado por nombre");
        for(Producto2 producto: productos1){
            System.out.println(producto);
        }
        
        System.out.println("---------");
        
        Collections.sort(productos1,new ComparatorStock2());
        System.out.println("Ordenado por stock");
        for(Producto2 productos2: productos1){
            System.out.println(productos2);        
        }
        
        System.out.println("---------");
        
        Collections.sort(productos1, new ComparatorPrecio2());
        System.out.println("Ordenado por precio");
        for(Producto2 productos2: productos1){
            System.out.println(productos2);
        }
        
    }
    
}
