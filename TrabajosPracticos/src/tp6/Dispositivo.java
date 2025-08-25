/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author ariel
 */
public abstract class Dispositivo {
    
    protected String nombreDelDispositivo;
    protected String estado;
    protected List<String>historial;
    
    public abstract void mostrarElHistorial();

    public Dispositivo(String nombreDelDispositivo,String estado) {
        this.estado = estado;
        this.nombreDelDispositivo = nombreDelDispositivo;
        this.historial= new ArrayList<>();
        historial.add(estado);
    }

    

    public void encender(){
        estado="Encendido";
        historial.add(estado);
        System.out.println("Ahora "+nombreDelDispositivo+" esta "+estado);
    
        }
    
    public void apagar(){
        estado="Apagado";
        historial.add(estado);
        System.out.println("Ahora "+nombreDelDispositivo+" esta "+estado);
    }
    public String estadoActual(){
        return "El estado actual de "+nombreDelDispositivo+ " es "+ estado;
    }
}
    
    
    