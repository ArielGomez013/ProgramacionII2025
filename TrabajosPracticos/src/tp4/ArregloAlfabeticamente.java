/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author ariel
 */
public class ArregloAlfabeticamente {
    private String[] arreglo;

    public ArregloAlfabeticamente(String[] arreglo) {
        this.arreglo = arreglo;
    }

    public String[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(String[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public void mostrarArreglo(){
        System.out.println("Mostrando arreglo");
        for(int i=0;i<arreglo.length;i++){
          System.out.println("- "+arreglo[i]);
        }
    }
    
    public int busquedaBinaria(String[]lista,String valor){ 
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        
        while (izquierda <= derecha){
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion=lista[medio].compareTo(valor);
            if (comparacion == 0)
            return medio;     
        if (comparacion < 0) {       
        izquierda = medio + 1;
        }
        else{        
        derecha = medio - 1;
        }
        }
        return -1;
        }
    }
    
    

