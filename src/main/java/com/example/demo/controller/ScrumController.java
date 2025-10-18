/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;
import com.example.demo.Scrum;
import com.example.demo.Desarrollador;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author ariel
 */
@RestController
@RequestMapping("api/scrum")
public class ScrumController {
    
    private Map<String,Scrum> proyectoScrum= new HashMap<>();
    
    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Scrum scrum = mapper.readValue(new File("scrum.json"), Scrum.class);
            proyectoScrum.put("Jira", scrum); 
            System.out.println("Scrum cargado al proyecto");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/{nombreScrum}/desarrolladores")
    public List<Desarrollador> listaDeDesarrollador(@PathVariable String nombreScrum){
    Scrum scrum= proyectoScrum.get(nombreScrum);
    if(scrum==null){
       return new ArrayList<>();
    }
    return scrum.getDesarrolladores();
    }
    
    @PostMapping("/{nombreScrum}/desarrolladores")
    public String agregarDesarrollador(@PathVariable String nombreScrum, @RequestBody Desarrollador desarrollador){
    Scrum scrum= proyectoScrum.get(nombreScrum);
    if(scrum==null){
       return "No se encontro el desarrollador a agregar";
    }
    scrum.agregarDesarrollador(desarrollador);
    guardarScrumEnArchivo(scrum);
    return "desarrollador agregado a "+nombreScrum;
    }
    
    @DeleteMapping("/{nombreScrum}/desarrolladores/{nombreBorrar}")
    public String eliminarDesarrollador(@PathVariable String nombreScrum, @PathVariable String nombreBorrar){
    Scrum scrum= proyectoScrum.get(nombreScrum);
    if(scrum==null){
    return "No se encontró el proyecto Scrum: "+nombreScrum;
    }
    boolean eliminado = scrum.eliminarDesarrollador(nombreBorrar);
    if (eliminado) {
        guardarScrumEnArchivo(scrum);
        return "Desarrollador eliminado: " + nombreBorrar;
    } else {
        return "Desarrollador no encontrado: " + nombreBorrar;
    }
}
    private void guardarScrumEnArchivo(Scrum scrum) {
    ObjectMapper mapper = new ObjectMapper();
    try {
        mapper.writeValue(new File("scrum.json"), scrum);
        System.out.println("Scrum guardado en archivo.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
