/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author ariel
 */
public class SprintDesarrollador {
    private Sprint sprint;
    private String tarea;
    private String rol;
    private Desarrollador desarrollador;
    
    public SprintDesarrollador() {
    }

    public SprintDesarrollador(Sprint sprint, String tarea, String rol, Desarrollador desarrollador) {
        this.sprint = sprint;
        this.tarea = tarea;
        this.rol = rol;
        this.desarrollador = desarrollador;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "SprintDesarrollador{" + "sprint=" + sprint + ", tarea=" + tarea + ", rol=" + rol + ", desarrollador=" + desarrollador + '}';
    }

    
    
    
    
}
