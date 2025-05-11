/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author ariel
 */
public class InteresCompuesto {
    private int inversion;
    private double tasaAnual;
    private int anio;

    public InteresCompuesto(int inversion, double tasaAnual, int anio) {
        this.inversion = inversion;
        this.tasaAnual = tasaAnual;
        this.anio = anio;
    }
   

    public double getInversion() {
        return inversion;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public int getAnio() {
        return anio;
    }

    public void setInversion(int inversion) {
        this.inversion = inversion;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

      
    
    
    
    
    public double formula(){
    double montofinal=inversion * Math.pow((1+tasaAnual),anio);
    return montofinal;
    }

}
