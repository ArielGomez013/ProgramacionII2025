/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public class Sensor extends Dispositivo {

    public Sensor(String nombreDelDispositivo, String estado) {
        super(nombreDelDispositivo, estado);
    }

    @Override
    public void mostrarElHistorial() {
        int i=1;
        System.out.println("Historial del "+nombreDelDispositivo+":");
        for(String estados:historial){
            System.out.println(i+"-"+estados);        
            i++;
        }
    }

   
 }