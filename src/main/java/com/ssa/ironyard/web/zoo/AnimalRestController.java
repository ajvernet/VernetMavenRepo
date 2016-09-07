package com.ssa.ironyard.web.zoo;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.ironyard.model.Animal;

@RestController
public class AnimalRestController {

    
    @Autowired
    AnimalMap animalMap;
    
    static final Logger LOGGER = LogManager.getLogger(AnimalRestController.class);

    @RequestMapping("/zoo/animals")
    @ResponseBody
    public ResponseEntity<List<Animal>> handle(){
        
        List<Animal> animalList = new ArrayList<>();
        for(Entry<String, Animal> e : animalMap.entrySet()){
            animalList.add(e.getValue());
        }
        
        return ResponseEntity.ok().header("X-Powered-By", "Spring Boot").body(animalList);
        
    }
    
    @RequestMapping("/zoo/animals/search/{continent}")
    @ResponseBody
    public ResponseEntity<List<Animal>> searchByContinent(@PathVariable String continent){
        
        List<Animal> animalList = new ArrayList<>();
        for(Entry<String, Animal> e : animalMap.entrySet()){
            if(e.getValue().getContinents().contains(continent))
            animalList.add(e.getValue());
        }
        
        return ResponseEntity.ok().header("X-Powered-By", "Spring Boot").body(animalList);
        
    }
    
    @RequestMapping("/zoo/animals/{animal_name}")
    @ResponseBody
    public ResponseEntity<Animal> search(@PathVariable String animal_name)
    {

        return ResponseEntity.ok().header("X-Powered-By", "Spring Boot").body(animalMap.getAnimal(animal_name));
        
    }


}
