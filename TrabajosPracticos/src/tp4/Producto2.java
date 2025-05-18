/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author ariel
 */
public class Producto2 implements Comparable<Producto2> {
    private String nombre1;
    private int precio1;
    private int stock1;

    public Producto2(String nombre1, int precio1, int stock1) {
        this.nombre1 = nombre1;
        this.precio1 = precio1;
        this.stock1 = stock1;
    }

    public String getNombre() {
        return nombre1;
    }

    public int getPrecio() {
        return precio1;
    }

    public int getStock() {
        return stock1;
    }

    public void setNombre(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setPrecio(int precio1) {
        this.precio1 = precio1;
    }

    public void setStock(int stock1) {
        this.stock1 = stock1;
    }
    
    @Override
    public int compareTo(Producto2 segundoProducto){
        return this.nombre1.compareTo(segundoProducto.nombre1);
    }
    
    @Override
    public String toString(){
       return nombre1+"/$"+precio1+"/"+stock1;
    
    }
}