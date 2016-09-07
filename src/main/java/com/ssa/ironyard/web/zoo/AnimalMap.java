package com.ssa.ironyard.web.zoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.ssa.ironyard.model.Animal;

@Component
public class AnimalMap {

    private Map<String, Animal> animalMap = new HashMap<>();
    
    public void put(String name, Animal animal){
        animalMap.put(name, animal);
    }
    
    public Set<Map.Entry<String, Animal>> entrySet(){
        return animalMap.entrySet();
    }
    
    public Animal getAnimal(String name){
        return animalMap.get(name);
    }
    
    
}
