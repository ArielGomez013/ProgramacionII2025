/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author ariel
 */
public class ValidarContraseña {
    String contraseña;

    public ValidarContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    
    String ingresarContraseña(){
       
        for (int i=0;i<contraseña.length();i++){
            char c= contraseña.charAt(i);
            if(Character.isDigit(c)){
                return "Contrasena valida";
            }
        }
      return "La contrasena debe tener un numero"; 
    }
}