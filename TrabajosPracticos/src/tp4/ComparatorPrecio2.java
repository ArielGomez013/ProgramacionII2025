/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;
import java.util.Comparator;
/**
 *
 * @author ariel
 */
public class ComparatorPrecio2 implements Comparator<Producto2> {
    @Override
    public int compare(Producto2 o1, Producto2 o2){
         return Integer.compare(o1.getPrecio(),o2.getPrecio());
    }
}
