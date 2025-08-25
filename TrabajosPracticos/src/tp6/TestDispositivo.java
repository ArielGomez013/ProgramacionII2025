/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public class TestDispositivo {

    public static void main(String[] args) {
        Dispositivo dispositivo1= new Altavoz("Altavoz","Apagado");
        Dispositivo dispositivo2= new Sensor("Sensor","Encendido");
        Dispositivo dispositivo3= new Camara("Camara","Apagado");
        
        
        System.out.println(dispositivo1.estadoActual());
        dispositivo1.encender();
        System.out.println(dispositivo1.estadoActual());
        dispositivo1.apagar();
        dispositivo1.mostrarElHistorial();
        System.out.println("--------------------");
        System.out.println(dispositivo2.estadoActual());
        dispositivo2.apagar();
        System.out.println(dispositivo2.estadoActual());
        dispositivo2.encender();
        dispositivo2.mostrarElHistorial();
        System.out.println("--------------------");
        System.out.println(dispositivo3.estadoActual());
        dispositivo3.encender();
        System.out.println(dispositivo3.estadoActual());
        dispositivo3.apagar();
        dispositivo3.mostrarElHistorial();
    }
    
}
