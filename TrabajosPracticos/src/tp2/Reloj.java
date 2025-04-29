/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelojE2Tp2;

/**
 *
 * @author ariel
 */
public class Reloj {
    private int seg;
    private int min;
    private int hora;

    public int getSeg() {
        return seg;
    }

    public int getMin() {
        return min;
    }

    public int getHora() {
        return hora;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    public String estalecerHora(){
        return hora+","+min+","+seg;
    }
    public String mostrarHora(){
          String hora1 = (hora < 10 ? "0" + hora : "" + hora);  // Añadir 0 si la hora es menor de 10
        String min1 = (min < 10 ? "0" + min : "" + min);     // Añadir 0 si los minutos son menores de 10
        String seg1 = (seg < 10 ? "0" + seg : "" + seg);     // Añadir 0 si los segundos son menores de 10

        return hora1 + ":" + min1 + ":" + seg1;  // Concatenación de la hora, minutos y segundos
    }
    public String avanzarSegundo(){
        seg++;
        
        if(seg==60){
           seg=0;
           min++;
        }
        if(min==60){
            min=0;
            hora++;
     }
        if(hora==24){
            hora=0;
        }  
      return hora+":"+min+":"+seg;
    }
}


