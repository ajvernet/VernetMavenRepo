package com.ssa.ironyard.web;

import java.time.LocalDate;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @Autowired
    WeatherService weather;
    
    @RequestMapping("/")
    @ResponseBody
    public String greet()
    {
        return "Our first web app";
    }
    
    @RequestMapping("/foo")
    @ResponseBody
    public Map<String, LocalDate> now()
    {
        Map<String, LocalDate> model = new HashMap<String, LocalDate>();
        model.put("now", LocalDate.now());
        return model;
    }
    
  
    @RequestMapping("/zucchini")
    @ResponseBody
    public Vegetable zucchini()
    {
        return new Vegetable(Vegetable.Color.YELLOW, "zucchini");
    }
    
    @RequestMapping("/newVeggie")
    @ResponseBody
    public Vegetable newVeggie(HttpServletRequest request)
    {
        if(request.getParameter(("name")) != null)
            return new Vegetable(Vegetable.Color.GREEN, request.getParameter("name"));
        
        return new Vegetable(Vegetable.Color.GREEN, "zucchini");
     }

    
    @RequestMapping("/veggies")
    @ResponseBody
    public String veggieCounts()
    {
//        Vegetable zuch1 = new Vegetable(Vegetable.Color.GREEN, "Zucchini");
//        Vegetable zuch2 = new Vegetable(Vegetable.Color.GREEN, "Zucchini");
//        Vegetable zuch3 = new Vegetable(Vegetable.Color.GREEN, "Zucchini");
        return "Number of veggies is: " + Vegetable.numVeggies;
    }
    
    
//    @RequestMapping("/autoVeg")
//    @ResponseBody
//    public String currName(){
//        return this.veggie.getName();
//    }
    @RequestMapping("/temp")
    @ResponseBody
    public float currentTemp()
    {
        return this.weather.temperature();
    }
}
