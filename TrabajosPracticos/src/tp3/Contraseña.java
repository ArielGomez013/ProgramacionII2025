/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author ariel
 */
public class Contraseña {
       private String contrasena;

    public Contraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
       
    public String longitudContraseña(){
        int longitud= contrasena.length();
        if(contrasena.length()>=8){
         //  System.out.println("Bienvenido");
           return contrasena;
        }
        else{
           System.out.println("ERROR, la contrasena tiene menos de 8 caracteres: "+longitud+ " caracteres");
           return null;       
        } 
    }
    
    public String encontrarNumero(){
        for (int i=0;i<contrasena.length();i++){
            char c= contrasena.charAt(i);
            if(Character.isDigit(c)){
                return "La contrasena tiene digito:";
            }
         
        }
       return "La contrasena no tiene digito";
    } 
    
    public String encontrarCaracter(){
        for(int i=0;i<contrasena.length();i++){
            char c= contrasena.charAt(i);
            if(c=='@' || c =='!' || c=='#' || c=='%' || c=='^' || c=='&' || c=='*'){
                return "La contrasena tiene caracter especial:";
            }
        }
      return "La contrasena no tiene caracter especial";
    }
    
    public String generarContraseñaSegura(int longitud){
        String caracter="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#$%&*^";
        StringBuilder contrasenaNueva= new StringBuilder();
        
        for(int i=0;i<longitud;i++){
            int indice=(int)(Math.random()*caracter.length());
            contrasenaNueva.append(caracter.charAt(indice));
        }
        return contrasenaNueva.toString();
        
    
    }
}
