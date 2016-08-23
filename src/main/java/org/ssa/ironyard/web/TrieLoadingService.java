package org.ssa.ironyard.web;

import java.io.File;

import java.net.URL;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TrieLoadingService {

    static final Logger LOGGER = LogManager.getLogger(TrieLoadingService.class);
    
    Scanner sc;

    public TrieLoadingService(Trie t) throws Exception
    {
   
        URL resource = getClass().getClassLoader().getResource("corncob.txt");
        File file = new File(resource.toURI());
        
        LOGGER.info(resource.toString());
        sc = new Scanner(file);
        
        while(sc.hasNextLine()){
            t.addWord(sc.nextLine());
        }
        LOGGER.warn("file {}, exists?{}", file, file.exists());
        // TODO Auto-generated constructor stub

    }
}
 
