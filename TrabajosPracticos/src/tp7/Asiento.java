/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author ariel
 */
public class Asiento {
    public int numero;
    public boolean ocupado;

    public Asiento(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    
    
    
    void asientoOcupado(boolean estaOcupado){
        this.ocupado=estaOcupado;
           }
}
