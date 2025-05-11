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
public class TestTweets {
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
      //  Twetts tweet1=new Twetts("a","#parati","");
        System.out.println("Ingrese su nombre de usuario(con @)");
        String nombre=entrada.nextLine();
        System.out.println("Bienvenido, haga una publicacion(tambien ponga su nombre de usuario)");
        String publicacion=entrada.nextLine();
        System.out.println("Ingrese un hashtag(por ejemplo: #parati)");
        String hashtag=entrada.nextLine();
       // System.out.println("Ingrese su nombre de usuario(con @)");
       // String nombre=entrada.nextLine();
        
        Twetts twetts1=new Twetts(publicacion,hashtag,nombre);
        String textoOriginal= twetts1.tweet();
        
        if(textoOriginal!=null){
        System.out.println("Publicacion original: "+textoOriginal);
        System.out.println("Publicacion con el hashtag: "+twetts1.agregarHashtag());
        System.out.println("El usuario es: "+twetts1.extraerUsuarioDesdeTweet());
        
        System.out.println("Nuevo tweet: "+twetts1.twettNuevo());
                
        }
        entrada.close();
    }
    
}
