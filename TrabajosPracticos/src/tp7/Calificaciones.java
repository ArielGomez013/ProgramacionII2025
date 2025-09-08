/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author ariel
 */
public class Calificaciones {
    int calificacion;

    public Calificaciones(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    void estudianteAprobo(){
        if(calificacion<4){
           System.out.println("Esta desaprobado");
        }
        else{
           System.out.println("Esta aprobado");
        }
    }
           
}
