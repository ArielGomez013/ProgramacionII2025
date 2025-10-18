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
public class Provincia {
    @JsonProperty("Nombre")
    private String nombre;
    @JsonProperty("Gobernador")
    private String gobernador;

    public Provincia(String nombre, String gobernador) {
        this.nombre = nombre;
        this.gobernador = gobernador;
    }

    public Provincia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGobernador() {
        return gobernador;
    }

    public void setGobernador(String gobernador) {
        this.gobernador = gobernador;
    }

    @Override
    public String toString() {
        return "Provincia: "+ nombre + "Gobernador: " + gobernador ;
    }

    
    
    
}
