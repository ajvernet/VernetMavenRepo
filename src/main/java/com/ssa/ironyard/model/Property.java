package com.ssa.ironyard.model;

import org.springframework.stereotype.Component;

@Component
public class Property {

    
     String streetName;
     int streetAddress;
    int cost;  // US Dollars
    int floorArea; // sq ft
   
    public Property() {
        // TODO Auto-generated constructor stub
    }
    
    public Property(String streetName, int streetAddress, int cost, int floorArea) {

        this.streetName = streetName;
        this.streetAddress = streetAddress;
        this.cost = cost;
        this.floorArea = floorArea;
    }

    public String getAddress() {
        return streetAddress + streetName;
    }

    public int getCost() {
        return cost;
    }

    public int getFloorArea() {
        return floorArea;
    }

    public String getStreetName() {
        return streetName;
    }
    
    
    
    
    
}
