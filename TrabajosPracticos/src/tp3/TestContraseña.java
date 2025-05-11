/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class TestContraseña {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       // Contraseña contraseña1 = new Contraseña("a");
        
        System.out.println("Ingrese su contrasena: ");
        String ingresoContra= entrada.nextLine();
        Contraseña contraseña1 = new Contraseña(ingresoContra);
        String contraseñaOriginal= contraseña1.longitudContraseña();
        
        if(contraseñaOriginal!=null){
        System.out.println(contraseña1.encontrarNumero());
        System.out.println(contraseña1.encontrarCaracter());
       
        }
        System.out.println("Desea generar una contasena segura? ");
        System.out.println("1.Si");
        System.out.println("2.No");
        
        int opcion=entrada.nextInt();
        if(opcion==1){
            String nuevaContra= contraseña1.generarContraseñaSegura(10);
            System.out.println("Contrasena generada: "+nuevaContra);
        }
        else if(opcion==2){
            System.out.println("Cerrando Programa");
        }
        else{
            System.out.println("ERROR, ingrese 1 o 2");
        }
    }
    
}
