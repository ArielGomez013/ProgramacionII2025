/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected String caracteristica;
    
    public abstract String mostrarDetalle();
    
    public Producto(String nombre, double precio, String caracteristica) {
        this.nombre = nombre;
        this.precio = precio;
        this.caracteristica= caracteristica;
    }
    
}
