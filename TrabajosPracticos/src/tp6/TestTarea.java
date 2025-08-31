/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;
import java.time.LocalDate;
/**
 *
 * @author ariel
 */
public class TestTarea {

    
    public static void main(String[] args) {
        LocalDate fecha1= LocalDate.of(2025,2,10);
        LocalDate fecha2= LocalDate.of(2025,3,5);
        LocalDate fecha3= LocalDate.of(2025,4,20);
        Tarea tarea1= new Diseñar("Disenio digital",fecha1,"Maria");
        Tarea tarea2= new Programar("Programacion",fecha2,"Pablo"); 
        Tarea tarea3= new Documentar("Instrucciones del Programa",fecha3,"Anabel");
        tarea1.informe();
        tarea1.calcularTiempo();
        System.out.println("--------------------");
        tarea2.informe();
        tarea2.calcularTiempo();
        System.out.println("--------------------");
        tarea3.informe();
        tarea3.calcularTiempo();
    }
    
}
