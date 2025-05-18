/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ariel
 */
public class TestArregloAlfabeticamente {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String[] palabras={"casa","pelota","auto","telefono","comida","bocina","aereoterreste","aereo","automatico","bocinazo"};
        
        ArregloAlfabeticamente arreglos= new ArregloAlfabeticamente(palabras);
        arreglos.mostrarArreglo();
        Arrays.sort(palabras);
        System.out.println("Arreglo ordenado:");
        arreglos.mostrarArreglo();
        
        System.out.println("Ingrese la cadena a buscar");
        String cadena=entrada.next();
        
        int indice= arreglos.busquedaBinaria(palabras,cadena);
        if(indice!=-1){
           System.out.println("Cadena encontrada en la posicion: "+indice);
        }
        else{
           System.out.println("No se encontro la cadena");
        }
    }
    
}
