/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author ariel
 */
public class TestCine {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> numAsiento = new ArrayList<>();
        int asientoDisponible;
        System.out.println("Bienvenido, tiene 50 asientos el cine, por el momento todos estan disponibles si ingresa una sola vez");
        System.out.println("Ingrese el numero de asiento para validar si esta ocupado o no");
        System.out.println("Ponga 0 para terminar el programa ");
        do{
           asientoDisponible= entrada.nextInt();
           if(asientoDisponible==0){
              System.out.println("Saliendo");
              break;
           }
           if(asientoDisponible<1 || asientoDisponible>50){
              System.out.println("Error: Ingrese del 1 al 50");
              break;
           }
           
           try{
        if(numAsiento.contains(asientoDisponible)) {
           throw new CineException("El asiento esta ocupado");
        }
        
        Cine cliente1= new Cine(asientoDisponible);
        cliente1.asientoOcupado();
        numAsiento.add(asientoDisponible);

        }
        catch(CineException e){
           System.out.println("Error: "+e.getMessage());
           System.exit(0);
        }
        
        
        }   
        while(true);
       
    }
    
}
