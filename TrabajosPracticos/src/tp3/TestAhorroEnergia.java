/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author ariel
 */


/*
 * Este programa calcula el ahorro de energía anual de varios electrodomésticos inteligentes.
 * Utiliza la reducción del consumo de electricidad (ahorro anual) y muestra:
 * - El ahorro anual de cada electrodoméstico.
 * - El ahorro total de todos los electrodomésticos.
 * - El electrodoméstico con el mayor y menor ahorro de energía.
 */
public class TestAhorroEnergia {

    public static void main(String[] args) {
        
        
        AhorroEnergia objeto1=new AhorroEnergia("Microondas",30);
        AhorroEnergia objeto2=new AhorroEnergia("Licuadora",15);
        AhorroEnergia objeto3=new AhorroEnergia("Televisor",10);
        AhorroEnergia objeto4=new AhorroEnergia("PC",20);
        
        System.out.println("Bienvenido, vamos a calcular el ahorro anual de energia segun su reduccion de consumo");
        System.out.println("El " +objeto1.getElectrodomesticos()+ " consume " + objeto1.getAhorroAnual()+" kWh,el ahorro anual es de: "+String.format("%.2f",objeto1.calcularAhorro())+ "kWh");
        System.out.println("La " +objeto2.getElectrodomesticos()+ " consume " + objeto2.getAhorroAnual()+" kWh,el ahorro anual es de: "+String.format("%.2f",objeto2.calcularAhorro())+"kWh");
        System.out.println("El " +objeto3.getElectrodomesticos()+ " consume " + objeto3.getAhorroAnual()+" kWh,el ahorro anual es de: "+String.format("%.2f",objeto3.calcularAhorro())+"kWh");
        System.out.println("La " +objeto4.getElectrodomesticos()+ " consume " + objeto4.getAhorroAnual()+" kWh,el ahorro anual es de: "+String.format("%.2f",objeto4.calcularAhorro())+"kWh");
        
        double ahorroTotal=objeto1.calcularAhorro()+objeto2.calcularAhorro()+objeto3.calcularAhorro()+objeto4.calcularAhorro();
        
        System.out.println("Ahora, el ahorro anual total de todos los aparatos es de: "+String.format("%.1f",ahorroTotal)+" kWh");
        
        double valorMenor=Math.min(objeto1.calcularAhorro(),
                          Math.min(objeto2.calcularAhorro(),
                          Math.min(objeto3.calcularAhorro(),objeto4.calcularAhorro())));
        
        double valorMayor=Math.max(objeto1.calcularAhorro(),
                          Math.max(objeto2.calcularAhorro(),
                          Math.max(objeto3.calcularAhorro(),objeto4.calcularAhorro())));
        
        System.out.println("El que menor consume es: "+String.format("%.2f",valorMenor));
        System.out.println("El que mayor consume es: "+String.format("%.2f",valorMayor));
    }   
    
}
