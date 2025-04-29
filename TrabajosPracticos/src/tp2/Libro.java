/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElLibroE4Tp2;

/**
 *
 * @author ariel
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String estado;

    public Libro(String titulo, String autor, String isbn, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEstado() {
        return estado;
    }
    
    public String prestar(){
        estado="prestado";
        return estado;
    }
    public String devolver(){
        estado="disponible";
        return estado;
    }
    public void mostrarInformacion(){
        System.out.println(""+titulo+"//"+autor+"//"+isbn+"//"+estado);
    }
}
