/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author ariel
 */
public class Ciudad {
    @JsonProperty("Nombre")
    private String nombre;
    @JsonProperty("Habitantes")
    private int numeros_habitantes;

    public Ciudad(String nombre, int numeros_habitantes) {
        this.nombre = nombre;
        this.numeros_habitantes = numeros_habitantes;
    }

    public Ciudad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeros_habitantes() {
        return numeros_habitantes;
    }

    public void setNumeros_habitantes(int numeros_habitantes) {
        this.numeros_habitantes = numeros_habitantes;
    }

    @Override
    public String toString() {
        return "Ciudad: "+ nombre + " Habitantes: " + numeros_habitantes;
    }
    
    
}
