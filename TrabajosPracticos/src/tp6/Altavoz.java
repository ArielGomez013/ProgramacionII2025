/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;


/**
 *
 * @author ariel
 */
public class Altavoz extends Dispositivo{

    public Altavoz(String nombreDelDispositivo,String estado) {
        super(nombreDelDispositivo, estado);
    }

    

    @Override
    public void mostrarElHistorial() {
        System.out.println("Historial de "+nombreDelDispositivo+":");
        for(int i=1;i<historial.size();i++){
           System.out.println(historial);
           i++;
        }
    }

}
    