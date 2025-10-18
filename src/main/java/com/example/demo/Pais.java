/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author ariel
 */
public class Pais {
    @JsonProperty("Nombre")
    private String nombre;
    @JsonProperty("Provincia")
    private List<Provincia> provincias;
    @JsonProperty("Ciudad")
    private List<Ciudad> ciudades;

    public Pais(String nombre, List<Provincia> provincias, List<Ciudad> ciudades) {
        this.nombre = nombre;
        this.provincias = provincias;
        this.ciudades = ciudades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Pais: "+ nombre + "Provincia:" + provincias + "Ciudad: " + ciudades ;
    }
    
    
}
