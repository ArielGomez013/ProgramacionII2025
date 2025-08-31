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
public class Diseñar extends Tarea{
    private LocalDate fechaDeFin;
    
    public Diseñar(String nombre, LocalDate fechaDeInicio, String responsable) {
        super(nombre, fechaDeInicio, responsable);
    }
    
    
    public void TareaRealizada(){
        
        
    }

    @Override
    public void calcularTiempo() {
        int diseñoPantalla=5;//diseña 5 pantalla por dia;
        fechaDeFin= LocalDate.of(2025,2,28);
        System.out.println("Fecha de Fin: "+fechaDeFin);
        System.out.println(responsable+" realiza 5 pantallas por dia (8 horas por dia)");
        int tiempoTotal=(diseñoPantalla*8); //aqui deberia restar la fecha de fin con la inicial, que daria 18, y luego multiplico por la cantidad de pantallas que puede realizar en el dia 
        System.out.println("Tiempo total invertido en la tarea: "+tiempoTotal+" horas");
    }
    
}
