/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class TestProducto {
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
     //   Producto producto1= new Alimenticio(21,25,"Leche",799.99,"Descremada");
        Producto producto2= new Electronico(6,"Samsung A10",80000.00,"Barato");
        Producto producto3= new Ropa('L',"Remera",11999.99,"Algodon");
        System.out.println("Ingrese la fecha actual de Leche");
        int fecha=entrada.nextInt();
        System.out.println("Ingrese la fecha de vencimiento de Leche");
        int vencimiento=entrada.nextInt();
        Producto producto1= new Alimenticio(fecha,vencimiento,"Leche",799.99,"Descremada");
        System.out.println(producto1.mostrarDetalle());
        System.out.println("-----------------------");
        System.out.println(producto2.mostrarDetalle());
        System.out.println("-----------------------");
        System.out.println(producto3.mostrarDetalle());
    }
    
}
