/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.demo;
//import com.fasterxml.jackson.core.type.TypeReference;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.*;
//Trello
/**
 *
 * @author ariel
 */
public class TestScrumb {

    public static void main(String[] args) {
        try{
        ObjectMapper mapper= new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        Sprint sprint1 = new Sprint(1,8);
        Sprint sprint2 = new Sprint(8,15);
        
        Desarrollador desarrollador1= new Desarrollador("Pablo");
        Desarrollador desarrollador2= new Desarrollador("Miguel");
        
        SprintDesarrollador sd1= new SprintDesarrollador(sprint1,"API","Backend",desarrollador1);
        SprintDesarrollador sd2= new SprintDesarrollador(sprint2,"Disenio Digital","Frontend",desarrollador2);
        
        List<Sprint> sprints= List.of(sprint1,sprint2);
        List<Desarrollador> desarrolladores= List.of(desarrollador1,desarrollador2);
        List<SprintDesarrollador> relacion= List.of(sd1,sd2);
        
        Scrum scrum1= new Scrum("Jira",sprints,desarrolladores,relacion);
        
        mapper.writeValue(new File("scrum.json"), scrum1);
        System.out.println("Scrum serializado a JSON");
                
        Scrum scrumLeer= mapper.readValue(new File("scrum.json"),Scrum.class);
        System.out.println("Scrum deserializada");
        System.out.println(scrumLeer);
        }
        
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}

