package com.ssa.ironyard.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Continents {
    NORTH_AMERICA, SOUTH_AMERICA, AFRICA, EUROPE, ASIA, ANTARTICA, AUSTRALIA;
    
    
    
    public static boolean contains(String string){
        List<String> continents = new ArrayList<String>(Arrays.asList(
                "NORTH_AMERICA", "SOUTH_AMERICA", "AFRICA", "EUROPE", 
                "ASIA", "ANTARTICA", "AUSTRALIA"));
                
      return continents.contains(string.toUpperCase());  
    }
    
}

