/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class TestValidarContraseña {
    
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una contrasenia: ");
        String contraseña= entrada.nextLine();
        
        try{
        if(contraseña==null || contraseña.equals("")){
           throw new NullPointerException("La contrasena no puede contener nada");
        }
        if(contraseña.length()<=8){
           throw new PasswordException ("La contrasena debe tener mas de 8 caracteres");
        }
        ValidarContraseña contraseña1= new ValidarContraseña(contraseña);
        String contraValida=contraseña1.ingresarContraseña();
        System.out.println(contraValida);
    }
        
        catch(NullPointerException e){
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
        catch(PasswordException e){
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
}
