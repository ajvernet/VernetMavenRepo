package org.ssa.ironyard.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class PropertyDataBase {

    private Map<String, List<Property>> propertyMap = new HashMap<>();
    
    public Map<String, List<Property>> getMap(){
        return propertyMap;
    }
    
    public List<Property> getProperties(String city){
        return new ArrayList<>(propertyMap.get(city));
    }
    
    public boolean containsCity(String city){
        return Objects.isNull(propertyMap.get(city)) ? false : true;
    }
    
    public void put(String city){
        propertyMap.put(city, new ArrayList<Property>(0));
    }
    
    public void addProperty(String city, Property property){
        propertyMap.get(city).add(property);
        
    }
    
    public List<Property> getPropertiesOnStreet(String city, String streetName){
        
        List<Property> streetList = new ArrayList<>();
        for(Property p: propertyMap.get(city)){
            if(p.getStreetName().equals(streetName)) streetList.add(p);
        }
        
        return streetList;
    }
}
