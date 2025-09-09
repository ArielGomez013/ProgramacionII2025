/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;
import java.util.*;

/**
 *
 * @author ariel
 */
public class Cine {
    public int capacidad;
    public int asientoDisponible;
    public List<Asiento> asiento;

    public Cine(int capacidad) {
        if(capacidad<=0){
           throw new IllegalArgumentException("La capacidad de la sala deber un numero positivo");
        }
        
        this.capacidad = capacidad;
        this.asientoDisponible = 0;
        this.asiento = new ArrayList<>();
        
        for(int i=1;i<=capacidad;i++){
           asiento.add(new Asiento(i));
        }
    }
        
    public void asientoReservar(int numero){
        if(numero<1 || numero>capacidad){
           throw new AsientoException("El valor ingresado es negativo, nulo o esta afuera del rango de la capacidad que usted ingreso");
        }
    Asiento asientoReservado= asiento.get(numero-1);
    if(asientoReservado.isOcupado()){
       throw new AsientoOcupadoException ("El asiento ya esta ocupado\n");
    }
    else{
       asientoReservado.asientoOcupado(true);
       asientoDisponible--;
       System.out.println("Asiento reservado\n");
    }
}
    public void mostrarAsiento(){
       for(Asiento asiento: asiento){
           System.out.println("Asiento N*"+asiento.getNumero()+" esta:"+(asiento.isOcupado()?"Ocupado":"Libre"));
       }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAsientoDisponible() {
        return asientoDisponible;
    }
    
    
}