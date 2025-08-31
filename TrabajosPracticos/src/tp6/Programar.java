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
public class Programar extends Tarea{
    private LocalDate fechaDeFin;

    public Programar(String nombre, LocalDate fechaDeInicio, String responsable) {
        super(nombre, fechaDeInicio, responsable);
    }
    
    

    @Override
    public void calcularTiempo() {
        int dia=30;
        fechaDeFin= LocalDate.of(2025,04,05);
        System.out.println("Fecha de Fin: "+fechaDeFin);
        System.out.println(responsable+" realiza 100 lineas de codigo por dia (6 horas cada dia) ");
        int tiempoTotal=(dia*6); 
        System.out.println("Tiempo total invertido en la tarea: "+tiempoTotal+" horas");
    }

    
    
    
    
}
