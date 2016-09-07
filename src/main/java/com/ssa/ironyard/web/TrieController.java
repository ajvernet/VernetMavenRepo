package com.ssa.ironyard.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
public class TrieController {

   @Autowired
    Text9Trie t;
   
   
//   public void setT(Mock9Trie mock9Trie) {
//    this.t = mock9Trie;
//    }
    
    @RequestMapping("/Trie")
    @ResponseBody
    public List<String> getCorn(HttpServletRequest request)
    {
        
        if(request.getParameter(("digits")) != null){
            return t.suggest(request.getParameter("digits"));
        } else {throw new IllegalArgumentException("you must provide digits");}
        
        
       // return new ArrayList<String>(0);
 
        
    }
    
 
}
