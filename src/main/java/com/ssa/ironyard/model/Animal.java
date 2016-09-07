package com.ssa.ironyard.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.ssa.ironyard.web.zoo.AnimalRestController;

public class Animal {
    
    static final Logger LOGGER = LogManager.getLogger(Animal.class);
    String name;
    List<Continents> continents;
    String fact;
    String link;
     
     
    public Animal(){}
    
    public Animal(String name, List<Continents> continents, String fact) {
        LOGGER.warn("Animal being created");
        this.name = name;
        this.continents = new ArrayList<>(continents);
        this.fact = fact;
        link = "localhost8080/zoo/animals/" + name;
    }
    
    public List<Continents> addContinent(Continents continent){
        continents.add(continent);
        return continents;
    }

    public String getName() {
        return name;
    }

    public List<Continents> getContinents() {
        return continents;
    }
    

    public String getFact() {
        return fact;
    }
    
    public String getLink(){
        return name + ", " + link;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + ", Continents: " + continents.toString() + 
                ", Fun Fact: " + fact;
    }
    
    
}
