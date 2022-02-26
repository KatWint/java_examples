package com.katwdojo.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Mrs. William";
        String itemName = "Mesh string";
        double price = 3.25;
        String description = "Mesh strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Art Store";
    
    	model.addAttribute("customer", name);
    	model.addAttribute("item", itemName);
    	model.addAttribute("price", price);
    	model.addAttribute("description", description);
    	model.addAttribute("vendor", vendor);
    	
        return "index.jsp";
    }
    


}
