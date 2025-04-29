/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpleadoE5Tp2;

/**
 *
 * @author ariel
 */
public class Empleado {
    private int legajo;
    private String nombre;
    private float salario;
    public static int cantidad_empleados=0;

    public Empleado(int legajo, String nombre, float salario) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.salario = salario;
        cantidad_empleados++;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSalario() {
        return salario;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    public void numLegajo(int legajo1){
        if(legajo==legajo1){
           System.out.println("El legajo no puede ser el mismo");
        }
        else{ 
           //System.out.println("Agregado exitosamente");
           
        }
        
    }
    public float aumentar_salario(float monto){
        salario=salario*(1+monto/100);
        System.out.print("Motivo del aumento: Buen desempenio");
        return salario;
    }        
    public static int cantidadEmpleado(){
        return cantidad_empleados;
    }
}
