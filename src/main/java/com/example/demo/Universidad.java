/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author ariel
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Universidad {
//    @NotBlank(message="El nombre no puede estar vacio");
//    @JsonProperty("Universidad")
    private String nombre;
    private String localidad;
    private List<Alumno> alumnos;

    public Universidad() {
    }

    public Universidad(String nombre, String localidad, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    @Override
    public String toString(){
        return "Universidad: "+nombre+"Localidad: "+localidad+"Alumno: "+alumnos;
    }
    
}
