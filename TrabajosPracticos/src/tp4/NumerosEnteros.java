/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author ariel
 */
public class NumerosEnteros {
    private int[] numero;

    public NumerosEnteros(int[] numero) {
        this.numero = numero;
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }
    public void mostrarArreglo(){
    System.out.println("Mostrando arreglo");
    for(int i=0;i<numero.length;i++){
        System.out.println("- "+numero[i]);
    }
    }
    
    public int sumarElementos() { 
        int suma = 0; 
        for (int elemento : numero){       
             suma += elemento;    
     } 
        return suma; 
 }  
    public int encontrarMin(){
        int minimo=numero[0];
        for(int i=1;i<numero.length;i++){
            minimo=Math.min(minimo,numero[i]);
        }
        return minimo;
    }
    public int encontrarMax(){
        int maximo=numero[0];
        for(int i=1;i<numero.length;i++){
            maximo=Math.max(maximo,numero[i]);
        }
        return maximo;
    }
    public void invertirOrden(){
        System.out.println("Invirtiendo el orden:");
        for(int i=numero.length-1;i>=0;i--){
            System.out.println("- "+numero[i]);        
        }
        
    }
    
}