/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author ariel
 */
public class Producto implements Comparable<Producto>{
    private String nombre;
    private int precio;
    private int stock;

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public int compareTo(Producto otroPrecio){
       //  return Double.compare(this.precio, otroPrecio.precio);
         return this.precio-otroPrecio.precio;
    }
    
    @Override 
    public String toString(){
        return nombre+"/$"+precio+"/"+stock;
    
    }
    
}
