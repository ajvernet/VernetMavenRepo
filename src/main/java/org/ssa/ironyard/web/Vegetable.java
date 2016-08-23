package org.ssa.ironyard.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


public class Vegetable {
    
    public static int numVeggies = 0;
    private final Color color;
    private final String name;
    
    static final Logger LOGGER = LogManager.getLogger(Vegetable.class);
    
    public Vegetable(Color color, String name) {
        numVeggies++;
        this.color = color;
        this.name = name;
        
        LOGGER.warn("Number of veggies is: " + numVeggies);
    }



    public Color getColor() {
        LOGGER.warn(color);
        return color;
    }



    public String getName() {
        return name;
    }

    public enum Color
    {
        RED, GREEN, BLUE, PURPLE, YELLOW;
    }
}
