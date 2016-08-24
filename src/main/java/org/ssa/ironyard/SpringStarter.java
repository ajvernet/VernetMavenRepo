package org.ssa.ironyard;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.ssa.ironyard.web.Vegetable;
import org.ssa.ironyard.web.Vegetable.Color;

@SpringBootApplication
public class SpringStarter {

    static final Logger LOGGER = LogManager.getLogger(SpringStarter.class);
    public static void main(String[] args) {
        LOGGER.warn("Will this show up?");
        Vegetable zuch1 = new Vegetable(Vegetable.Color.GREEN, "Zucchini");
        Vegetable zuch2 = new Vegetable(Vegetable.Color.GREEN, "Zucchini");
        Vegetable zuch3 = new Vegetable(Vegetable.Color.GREEN, "Zucchini");
        zuch1.getColor();
        
        
        SpringApplication.run(SpringStarter.class, args);
    }
}
