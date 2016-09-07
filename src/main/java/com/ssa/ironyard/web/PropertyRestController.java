package com.ssa.ironyard.web;

import java.util.List;
import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.ironyard.model.Property;
import com.ssa.ironyard.model.PropertyDataBase;

@RestController
public class PropertyRestController {
    
    @Autowired
    PropertyDataBase p;

    
    static final Logger LOGGER = LogManager.getLogger(PropertyRestController.class);
       
    
        @RequestMapping("/realestate/{city}/{street}")
        @ResponseBody    
        public List<Property> search(@PathVariable String city, @PathVariable String street){
            
            
            if (p.containsCity(city)) 
            {
                if (Objects.nonNull(p.getPropertiesOnStreet(city, street))) return  p.getPropertiesOnStreet(city, street);
                
                else {throw new IllegalArgumentException("There are no properties on that street.");}
 
            }
                
            
            else {throw new IllegalArgumentException("There are no properties in that city.");}
        }
        
        @RequestMapping("/realestate/{city}")
        @ResponseBody
        public List<Property> search(@PathVariable String city){
            if (p.containsCity(city)) return p.getProperties(city);
            
            else {throw new IllegalArgumentException("There are no properties in that city.");}
        }
        
}
