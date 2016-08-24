package org.ssa.ironyard.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.ssa.ironyard.model.Property;
import org.ssa.ironyard.model.PropertyDataBase;

@Component
public class FillProperties {

    static final Logger LOGGER = LogManager.getLogger(PropertyDataBase.class);

    @Autowired
    PropertyDataBase p;
    
    final FileFactory ff;
    
    @Autowired
    public FillProperties(PropertyDataBase p) throws FileNotFoundException{
        this.p = p;
        ff = new WebFileFactory("propertyFile.txt");
        File file = ff.getInstance();
        LOGGER.warn("Does file exist?: " + file.exists());
        scanAndPut(file);

    }

   
    public FillProperties(PropertyDataBase p, String fileName) throws FileNotFoundException{
        this.p = p;
        ff = new WebFileFactory(fileName);
        File file = ff.getInstance();
        scanAndPut(file);
    }
   

   private void scanAndPut(File file) throws FileNotFoundException{
       Scanner sc = new Scanner(file);
       
       while(sc.hasNext()){
           String city = sc.next();
           String streetName = sc.next();
           int streetNumber = sc.nextInt();
           int cost = sc.nextInt();
           int area = sc.nextInt();

           if(!p.containsCity(city)) p.put(city);
//           
//           for(Entry e: p.getMap().entrySet()){
//               System.out.println(e);
//           }
           p.addProperty(city, new Property(streetName, streetNumber, cost, area));

       }
       
       sc.close();
   }
}
