/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.Alumno;
import com.example.demo.Universidad;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.util.Arrays;

/**
 *
 * @author ariel
 */
public class TestUniversidad {

    
    public static void main(String[] args) {
        try{
                ObjectMapper mapper= new ObjectMapper();
                mapper.enable(SerializationFeature.INDENT_OUTPUT);
                
                Alumno a1= new Alumno("Esteban",1234,"Concepcion");
                Alumno a2= new Alumno("Valeria",1235,"Monteros");
                Alumno a3= new Alumno("Ana",1236,"Famailla");
                
                Universidad uni= new Universidad("UNSTA","Concepcion",Arrays.asList(a1,a2,a3));
                
                mapper.writeValue(new File("universidad.json"), uni);
                System.out.println("Universidad serializada a JSON");
                
                Universidad uniLeer= mapper.readValue(new File("universidad.json"),Universidad.class);
                System.out.println("Universidad deserializada");
                System.out.println(uniLeer);
                }
             
                
                catch(Exception e){
                   e.printStackTrace();
                }
	}
    }
    
