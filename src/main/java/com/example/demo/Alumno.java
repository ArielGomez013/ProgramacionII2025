/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author ariel
 */
public class Alumno {
    private String nombre;
    private int id;
    private String localidad;

    public Alumno() {
    }

    public Alumno(String nombre, int id, String localidad) {
        this.nombre = nombre;
        this.id = id;
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    @Override
    public String toString(){
       return "Nombre: "+nombre +"ID: "+ id +"Localidad: "+ localidad; 
    }    
    
}
