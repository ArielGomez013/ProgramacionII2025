/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author ariel
 */
public class AhorroEnergia {
   private String electrodomesticos;
   private double ahorroAnual;

    public AhorroEnergia(String electrodomesticos, double ahorroAnual) {
        this.electrodomesticos = electrodomesticos;
        this.ahorroAnual = ahorroAnual;
    }

    public String getElectrodomesticos() {
        return electrodomesticos;
    }

    public double getAhorroAnual() {
        return ahorroAnual;
    }

    public void setElectrodomesticos(String electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }

    public void setAhorroAnual(double ahorroAnual) {
        this.ahorroAnual = ahorroAnual;
    }
 
   
   public double calcularAhorro(){ 
       double calcularAhorro=Math.sqrt(ahorroAnual*12);
       return calcularAhorro;
       
   
       
   }
}
