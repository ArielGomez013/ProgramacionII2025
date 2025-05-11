/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author ariel
 */
public class Twetts {
    private String publicacion;
    private String hashtag;
    private String nombre;

    public Twetts(String publicacion, String hashtag, String nombre) {
        this.publicacion = publicacion;
        this.hashtag = hashtag;
        this.nombre = nombre;
    }

    public String getHiloTwett() {
        return publicacion;
    }

    public String getHashtag() {
        return hashtag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
   public String tweet(){
        int longitud= publicacion.length();
        if(publicacion.length()<=280){
            System.out.println("El valor de la cadena es de: "+longitud);
            return publicacion;
        }
        else{
            System.out.println("ERROR, maximo de caracteres: 280");
            System.out.println("El valor de la cadena es de: "+longitud);
            return null;
        }
   }
   public String agregarHashtag(){
       return publicacion + "."+ hashtag;
       }
   
   public String usuario(){
       return nombre+ " " + publicacion + " " + hashtag;
   }
   
   public String extraerUsuarioDesdeTweet() {
    // Encontramos la posición del primer @ en el tweet
    int posicion = publicacion.indexOf("@");

    // Si no hay un @ en el tweet, no se encontró un nombre de usuario
    if (posicion == -1) {
        return "No se encontró usuario en el tweet.";
    } else {
        // Buscar hasta el primer espacio después del @ (fin del nombre de usuario)
        int fin = publicacion.indexOf(" ", posicion);
        
        // Si no encontramos un espacio, el nombre de usuario es hasta el final del tweet
        if (fin == -1) {
            return publicacion.substring(posicion); // Devolvemos desde @ hasta el final
        } else {
            return publicacion.substring(posicion, fin); // Devolvemos desde @ hasta el primer espacio
        }
    }
}
   public String twettNuevo(){
        String fragmento1= "Hola,"
                + " ";
        String fragmento2= "soy ";
        String fragmento3= nombre;
        String fragmento4= ".";
        String fragmento5=hashtag;
        
        StringBuilder nuevo= new StringBuilder();
        nuevo.append(fragmento1);
        nuevo.append(fragmento2);
        nuevo.append(fragmento3);
        nuevo.append(fragmento4);
        nuevo.append(fragmento5);
        
        return nuevo.toString();
   }
       
}
