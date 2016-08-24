package org.ssa.ironyard.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrieLoadingService {

    static final Logger LOGGER = LogManager.getLogger(TrieLoadingService.class);
    
    Scanner sc;

    @Autowired
    public TrieLoadingService(FileFactory ff, Text9Trie t) throws URISyntaxException, FileNotFoundException
    {
        
       // URL resource = getClass().getClassLoader().getResource(fileName);
        File file = ff.getInstance();
        
       // LOGGER.info(resource.toString());
        sc = new Scanner(file);
        
        while(sc.hasNextLine()){
            t.addWord(sc.nextLine());
        }
        
        sc.close();
        
        LOGGER.warn("file {}, exists?{}", file, file.exists());
        // TODO Auto-generated constructor stub

    }
}
 
