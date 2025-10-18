/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author ariel
 */
public class Sprint {
    private int f_deInicio;
    private int f_deFin;

    public Sprint() {
    }

    public Sprint(int f_deInicio, int f_deFin) {
        this.f_deInicio = f_deInicio;
        this.f_deFin = f_deFin;
    }

    public int getF_deInicio() {
        return f_deInicio;
    }

    public void setF_deInicio(int f_deInicio) {
        this.f_deInicio = f_deInicio;
    }

    public int getF_deFin() {
        return f_deFin;
    }

    public void setF_deFin(int f_deFin) {
        this.f_deFin = f_deFin;
    }

    @Override
    public String toString() {
        return  "f_deInicio=" + f_deInicio + ", f_deFin=" + f_deFin + '}';
    }
    
    
}
