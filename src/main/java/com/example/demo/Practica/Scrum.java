/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;
import java.util.*;
/**
 *
 * @author ariel
 */
public class Scrum {
    private String nombre;
    private List<Sprint> sprints;
    private List<Desarrollador> desarrolladores;
    private List<SprintDesarrollador> sprintDesarrolladores;

    public Scrum(String nombre, List<Sprint> sprints, List<Desarrollador> desarrolladores, List<SprintDesarrollador> sprintDesarrolladores) {
        this.nombre = nombre;
        this.sprints = sprints;
        this.desarrolladores = desarrolladores;
        this.sprintDesarrolladores = sprintDesarrolladores;
    }

    public Scrum() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(List<Sprint> sprints) {
        this.sprints = sprints;
    }

    public List<Desarrollador> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(List<Desarrollador> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public List<SprintDesarrollador> getSprintDesarrolladores() {
        return sprintDesarrolladores;
    }

    public void setSprintDesarrolladores(List<SprintDesarrollador> sprintDesarrolladores) {
        this.sprintDesarrolladores = sprintDesarrolladores;
    }

    @Override
    public String toString() {
        return "Scrum{" + "nombre=" + nombre + ", sprints=" + sprints + ", desarrolladores=" + desarrolladores + ", sprintDesarrolladores=" + sprintDesarrolladores + '}';
    }
    
    public void agregarDesarrollador(Desarrollador d) {
    if (desarrolladores == null) {
        desarrolladores = new ArrayList<>();
    }
    desarrolladores.add(d);  
}

    public boolean eliminarDesarrollador(String nombre) {
    if (desarrolladores == null) return false;
    return desarrolladores.removeIf(d -> d.getNombre().equalsIgnoreCase(nombre));
}
    
    
}
