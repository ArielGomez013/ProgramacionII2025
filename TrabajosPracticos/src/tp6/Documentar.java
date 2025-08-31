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

public class Documentar extends Tarea {
    private LocalDate fechaDeFin;
    public Documentar(String nombre, LocalDate fechaDeInicio, String responsable) {
        super(nombre, fechaDeInicio, responsable);
    }

    @Override
    public void calcularTiempo() {
        int paginas=7;
        fechaDeFin= LocalDate.of(2025,4,30);
        System.out.println("Fecha de Fin: "+fechaDeFin);
        System.out.println(responsable+" realiza 7 paginas por dia (7 horas por dia) ");
        int tiempoTotal=paginas*7;  
        System.out.println("Tiempo total invertido en la tarea: "+tiempoTotal+" horas");
    }

    
}
