/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;
/**
 *
 * @author ariel
 */
public class TestTarea {

    
    public static void main(String[] args) {
        Tarea tarea1= new Diseñar("Disenio digital",20,28,"Maria",25);
        Tarea tarea2= new Programar("Programacion",69,98,"Pablo",85);//son los dias contados desde el 1 de enero hasta el 31 de diciembre, que seria el dia 365 
        Tarea tarea3= new Documentar("Instrucciones del Programa",1,26,"Anabel",26);
        tarea1.informe();
        System.out.println("--------------------");
        tarea2.informe();
        System.out.println("--------------------");
        tarea3.informe();
    }
    
}
