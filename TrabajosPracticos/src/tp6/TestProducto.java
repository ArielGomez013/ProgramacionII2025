/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public class TestProducto {
    
    public static void main(String[] args) {
        
        Producto producto1= new Alimenticio(21,25,"Leche",799.99,"Descremada");
        Producto producto2= new Electronico(6,"Samsung A10",80000.00,"Barato");
        Producto producto3= new Ropa('L',"Remera",11999.99,"Algodon");
        System.out.println(producto1.mostrarDetalle());
        System.out.println("Esta vencido? "+((Vencimiento)producto1).calcularVencimiento());
        System.out.println("-----------------------");
        System.out.println(producto2.mostrarDetalle());
        System.out.println("-----------------------");
        System.out.println(producto3.mostrarDetalle());
    }
    
}
