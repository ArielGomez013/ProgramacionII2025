/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author ariel
 */
public class Desarrollador {
    private String nombre;

    public Desarrollador(String nombre) {
        this.nombre = nombre;
    }

    public Desarrollador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Desarrollador{" + "nombre=" + nombre ;
    }
    
    
    
}
