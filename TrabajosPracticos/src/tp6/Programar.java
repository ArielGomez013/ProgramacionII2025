/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author ariel
 */
public class Programar extends Tarea{
    private int fechaActual;
    
    public Programar(String nombre, int fechaDeInicio, int fechaDeFin, String responsable, int fechaActual) {
        super(nombre, fechaDeInicio, fechaDeFin, responsable);
        this.fechaActual=fechaActual;
    }

    
    
    
    @Override
    public void informe() {
        int diasEnElProyecto;
        int diasTranscurridos;
        int progreso;
        double progresoFinal;
        
        diasEnElProyecto= fechaDeFin-fechaDeInicio;
        diasTranscurridos=fechaActual-fechaDeInicio;
        progreso= diasEnElProyecto*24;
        progresoFinal=((double)diasTranscurridos/diasEnElProyecto)*100;
                
        System.out.println("Tarea: " + nombre);
        System.out.println("Responsable: " + responsable);
        System.out.println("Fecha de inicio: 8 de Marzo");
        System.out.println("Fecha de fin: 10 de Abril");
        System.out.println("Fecha actual: 30 de marzo");
        System.out.println("Tiempo total invertido: " + progreso + " horas");
        System.out.println("Progreso total: "+String.format("%.2f", progresoFinal)+"%");
        
    }
    
}
