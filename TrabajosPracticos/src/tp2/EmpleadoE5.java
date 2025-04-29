/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmpleadoE5Tp2;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class EmpleadoE5 {

    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
   
        Empleado empleado1= new Empleado(1001,"Alejandro",20000);
        Empleado empleado2= new Empleado(1002,"Gaston",20000);
        Empleado empleado3= new Empleado(1003,"Roberto",20000);
        
        System.out.println("Informacion de los empleados(legajo,nombre,sueldo): ");
        System.out.println(""+empleado1.getLegajo()+"//"+empleado1.getNombre()+"//"+empleado1.getSalario());
        System.out.println(""+empleado2.getLegajo()+"//"+empleado2.getNombre()+"//"+empleado2.getSalario());
        System.out.println(""+empleado3.getLegajo()+"//"+empleado3.getNombre()+"//"+empleado3.getSalario());
        System.out.println("Ingrese su Legajo para agregarlo a la lista: ");
        int legajo=entrada.nextInt();
        empleado1.numLegajo(legajo);
        empleado2.numLegajo(legajo);
        empleado3.numLegajo(legajo);
        
        System.out.println("Aumentar el saldo de algun trabajador?");
        System.out.println("1.Si");
        System.out.println("2.No");
        int opcion=entrada.nextInt();
          if(opcion==1){
              System.out.println("Ingrese el porcentaje a aumentar");
              int aumento=entrada.nextInt();
              System.out.println("A cual trabajador?");
              System.out.println("1.Alejandro");
              System.out.println("2.Gaston");
              System.out.println("3.Roberto");
              int opciones=entrada.nextInt();
              if(opciones==1){
                  empleado1.aumentar_salario(aumento);
              }
              else if(opciones==2){
                  empleado2.aumentar_salario(aumento);
              }
              else if(opciones==3){
                  empleado3.aumentar_salario(aumento);
              }
              else{
                  System.out.println("Error, ingrese del 1 al 3");
              }
          }
          System.out.println("\nInformacion actualizada de los empleados (legajo, nombre, sueldo): ");
          System.out.println(empleado1.getLegajo() + "//" + empleado1.getNombre() + "//" + empleado1.getSalario());
          System.out.println(empleado2.getLegajo() + "//" + empleado2.getNombre() + "//" + empleado2.getSalario());
          System.out.println(empleado3.getLegajo() + "//" + empleado3.getNombre() + "//" + empleado3.getSalario());
          System.out.println("La cantidad de empleados es de: "+Empleado.cantidad_empleados);
    }
    
}
