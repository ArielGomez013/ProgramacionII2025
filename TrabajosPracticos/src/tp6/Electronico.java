/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public class Electronico extends Producto implements Garantia {
    private int mes;

    public Electronico(int mes, String nombre, double precio, String caracteristica) {
        super(nombre, precio, caracteristica);
        this.mes = mes;
    }
    
    
    @Override
    public String mostrarDetalle() {
        return "Producto: "+this.nombre+"\nPrecio: "+this.precio+"$"+"\nCaracteristica: "+this.caracteristica+"\nGarantia: "+mes+" meses";
    }

    @Override
    public int calcularGarantia() {
        return mes;
    }
    
}
