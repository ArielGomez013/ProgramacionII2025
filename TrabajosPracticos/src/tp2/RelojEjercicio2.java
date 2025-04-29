/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RelojE2Tp2;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class RelojEjercicio2 {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       Reloj miReloj= new Reloj();
       
       System.out.println("Ingrese la hora: ");
       int hora=entrada.nextInt();
       miReloj.setHora(hora);
       System.out.println("Ingrese los minutos: ");
       int minuto=entrada.nextInt();
       miReloj.setMin(minuto);
       System.out.println("Ingrese los segundos: ");
       int segundo=entrada.nextInt();
       miReloj.setSeg(segundo);
       
       String reloj= miReloj.estalecerHora();
       System.out.println(""+reloj);
       
       String reloj1=miReloj.mostrarHora();
       System.out.println("La hora ingresada es: "+reloj1);
       
       System.out.println("Quiere aumentar los segundos?: ");
       System.out.println("1.SI");
       System.out.println("2.No");
       int opcion=entrada.nextInt();
    
       switch(opcion){
           case 1:
           miReloj.avanzarSegundo();
           String reloj2=miReloj.mostrarHora();
           System.out.println("Ahora, la hora es: "+reloj2);
           break;
       case 2:
           System.out.println("Programa terminado");
           break;
       default:
           System.out.println("Error, Ingrese 1 o 2");
           break;
       }
    }
    
}
