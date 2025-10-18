/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.demo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author ariel
 */
@SpringBootApplication
public class TestPais {

    public static void main(String[] args) {
            try{
            ObjectMapper mapper= new ObjectMapper(); 
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            
            List<Ciudad> ciudades1= new ArrayList<>();
            ciudades1.add(new Ciudad("Concepcion",30000));
            ciudades1.add(new Ciudad("Veronica",10000));
            
            List<Provincia> provincias1= new ArrayList<>();
            provincias1.add(new Provincia("Tucuman","Osvaldo Jaldo"));
            provincias1.add(new Provincia("Buenos Aires","Pedro de la Vega"));
            
            List<Ciudad> ciudades2= new ArrayList<>();
            ciudades2.add(new Ciudad("Barcelona",150000));
            ciudades2.add(new Ciudad("Madrid",200000));
            
            List<Provincia> provincias2= new ArrayList<>();
            provincias2.add(new Provincia("Catalunia","Leonel Messi"));
            provincias2.add(new Provincia("Madrid","Cristiano Ronaldo"));
            
            Pais paises1= new Pais("Argentina",provincias1,ciudades1);
            Pais paises2= new Pais("España",provincias2,ciudades2);
            
            List<Pais> paises= new ArrayList<>();
            paises.add(paises1);
            paises.add(paises2);
            
            mapper.writeValue(new File("pais.json"), paises);
            System.out.println("Paises serializados");
            
            List<Pais> leerPais = mapper.readValue(new File("pais.json"),
                    new TypeReference<List<Pais>>(){});
            System.out.println("Paises deserializados");
            for(Pais p: leerPais){
                System.out.println(p);
            }
            
        }
        catch(IOException e){
             e.printStackTrace();
        }
    }
    
}
