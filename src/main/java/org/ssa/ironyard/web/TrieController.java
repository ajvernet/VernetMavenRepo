package org.ssa.ironyard.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class TrieController {

   @Autowired
    Trie t;
    
    @RequestMapping("/Trie")
    @ResponseBody
    public List<String> getCorn(HttpServletRequest request)
    {
        if(request.getParameter(("digits")) != null)
            return t.suggest(request.getParameter("digits"));
        return new ArrayList<String>(0);
 
        
    }
    
 
}
