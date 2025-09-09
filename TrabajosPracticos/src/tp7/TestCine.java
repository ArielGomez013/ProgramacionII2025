
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
        Cine cine=null;
        System.out.println("Bienvenido, ingrese cuantos asiento quiere tener su cine:");
        while(cine==null){
        try{
        int numAsiento= entrada.nextInt();
        cine=new Cine(numAsiento);
        System.out.println("Creado con exito");
        }
        catch(InputMismatchException e){
            System.out.println("Error, debe ingresar un numero, no letras o caracteres\n");
            System.exit(0);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error:"+e.getMessage());
            System.exit(0);
        }
        
    }
        int opcion=0;
        System.out.println("\nMenu:");   

            
                while (opcion != 3){
                try{
                   
                System.out.println("\n1. Mostrar asiento");
                System.out.println("2. Reservar asiento");
                System.out.println("3. Salir\n");
                System.out.print("Seleccione una opcion: ");
                opcion = entrada.nextInt();
                System.out.println("\n");
                switch (opcion) {
                    case 1:
                        cine.mostrarAsiento();
                        break;
                    case 2:
                        System.out.print("Ingrese el numero de asiento a reservar: ");
                        int numero = entrada.nextInt();
                        cine.asientoReservar(numero);
                        break;
                    case 3:
                        System.out.println("Programa terminado");
                        break;
                    default:
                        System.out.println("Opción no válida, ingrese 1, 2 o 3\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, debe ingresar un numero, no letras o caracteres\n");
                entrada.nextLine();
                opcion =0;
            } catch (AsientoOcupadoException e) {
                System.out.println("Error: " +e.getMessage());
                opcion =0;
            }
              catch(AsientoException e){
                System.out.println("Error: "+e.getMessage());
                opcion=0;
             }
        }
                
      }
    
    }