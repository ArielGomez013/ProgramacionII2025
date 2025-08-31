/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public class Ropa extends Producto {
    private char talle;

    public Ropa(char talle, String nombre, double precio, String caracteristica) {
        super(nombre, precio, caracteristica);
        this.talle = talle;
    }

    
    @Override
    public String mostrarDetalle() {
        return "Producto: "+this.nombre+"\nPrecio: "+this.precio+"$"+"\nCaracteristica: "+this.caracteristica+"\nTalle: "+talle;
    }
    

    
    
}
