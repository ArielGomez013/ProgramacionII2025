/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author ariel
 */
public class Cine {
    int asiento;

    public Cine(int asiento) {
        this.asiento = asiento;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
    
    void asientoOcupado(){
        System.out.println("El asiento n*"+this.asiento+" esta libre");
           }
}
