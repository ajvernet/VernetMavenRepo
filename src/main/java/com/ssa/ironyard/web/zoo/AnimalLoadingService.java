package com.ssa.ironyard.web.zoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssa.ironyard.model.Animal;
import com.ssa.ironyard.model.Continents;
import com.ssa.ironyard.web.FileFactory;
import com.ssa.ironyard.web.WebFileFactory;

@Component
public class AnimalLoadingService {

    static final Logger LOGGER = LogManager.getLogger(AnimalLoadingService.class);

    
        @Autowired
        AnimalMap animalMap;
        
        FileFactory ff;
 
        @Autowired
        public AnimalLoadingService(AnimalMap animalMap) throws FileNotFoundException {
            
            LOGGER.warn("loading method reached");
            
            this.animalMap = animalMap;
                    LOGGER.warn("map created");
                    
            ff = new WebFileFactory("animals.txt");
                    LOGGER.warn("FF created");
            File file = ff.getInstance();
            LOGGER.warn("File created");
            System.out.println(file.exists());
            LOGGER.warn("Does file exist?: " + file.exists());
            scanAndPut(file);
        }

        public void scanAndPut(File file) throws FileNotFoundException {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                List<Continents> continents = new ArrayList<>();
                String name = sc.nextLine();
                
                LOGGER.warn(name);
                
               // LOGGER.warn(Continents.valueOf(sc.next()));
                String next = null;
                while(true){
                    
                    next = sc.nextLine();
                    
                    LOGGER.warn(next);
                    
                    if (Continents.contains(next.trim())){
                        continents.add(Continents.valueOf(next.trim()));  
                        LOGGER.warn(continents.toString());
                    }
                    
                    else break;
                }
                String fact = next;
               // LOGGER.warn(fact);
                animalMap.put(name, new Animal(name, continents, fact));
                
                LOGGER.warn("Animal added: " + animalMap.getAnimal(name));
                continents.clear();
                
                if(!sc.hasNext()) break;
            }
            
            sc.close();
            
        }
        
}