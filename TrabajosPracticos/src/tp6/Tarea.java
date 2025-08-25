/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public abstract class Tarea {
    protected String nombre;
    protected int fechaDeInicio;
    protected int fechaDeFin;
    protected String responsable;
    
    public abstract void informe();

    public Tarea(String nombre, int fechaDeInicio, int fechaDeFin, String responsable) {
        this.nombre = nombre;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.responsable = responsable;
    }
    
    
}
