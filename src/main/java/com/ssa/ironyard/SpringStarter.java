package com.ssa.ironyard;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ssa.ironyard.web.Vegetable;
import com.ssa.ironyard.web.Vegetable.Color;

@SpringBootApplication
public class SpringStarter {

    static final Logger LOGGER = LogManager.getLogger(SpringStarter.class);
    public static void main(String[] args) {
        LOGGER.warn("Will this show up?");

        SpringApplication.run(SpringStarter.class, args);
    }
}
