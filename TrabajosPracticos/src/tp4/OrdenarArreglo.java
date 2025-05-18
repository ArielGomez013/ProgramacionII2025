/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author ariel
 */
public class OrdenarArreglo {
    private int[] numero;

    public OrdenarArreglo(int[] numero) {
        this.numero = numero;
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }
    public void mostrarArreglo(){
        System.out.println("Mostrando arreglo:");
        for(int i=0;i<numero.length;i++){
            System.out.println("- "+numero[i]);
        }            
    }
    //bubbleSort
    public void metodoBubbleSort() {
        int n = numero.length;   
        for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - i - 1; j++){
        if (numero[j] > numero[j + 1]){                             
        int temp = numero[j];  
        numero[j] = numero[j + 1];               
        numero[j + 1] = temp;           
        }   
        }   
        }
        
    }
    
}
