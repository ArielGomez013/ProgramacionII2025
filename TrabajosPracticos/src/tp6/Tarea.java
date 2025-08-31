/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;
import java.time.LocalDate;
/**
 *
 * @author ariel
 */
public abstract class Tarea {
    protected String nombre;
    protected LocalDate fechaDeInicio;
    protected String responsable;
    
    public abstract void calcularTiempo();
     
    public Tarea(String nombre, LocalDate fechaDeInicio, String responsable) {
        this.nombre = nombre;
        this.fechaDeInicio = fechaDeInicio;
        this.responsable = responsable;
    }
    
    public void informe(){
   
        
        System.out.println("Tarea: " + nombre);
        System.out.println("Responsable: " + responsable);
        System.out.println("Fecha de inicio: " + fechaDeInicio);
    
    }
}
