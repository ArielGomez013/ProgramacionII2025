/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public class Alimenticio extends Producto{
    private int fechaActual;
    private int vencimiento;

    public Alimenticio(int fechaActual, int vencimiento, String nombre, double precio, String caracteristica) {
        super(nombre, precio, caracteristica);
        this.fechaActual = fechaActual;
        this.vencimiento = vencimiento;
    }

    @Override
    public String mostrarDetalle() {
        return "Producto: "+this.nombre+"\nPrecio: "+this.precio+"$"+"\nCaracteristica: "+this.caracteristica+"\n"+calcularVencimiento();
    }
  
    

    public String calcularVencimiento() {
        int producto;
        producto=vencimiento-fechaActual;
        if(producto<=0){
           return this.nombre+" esta vencido";
           
        }
        
        else{
           return this.nombre+" no esta vencido";
        }
    }

    
}
