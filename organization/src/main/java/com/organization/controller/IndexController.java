package com.organization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	 @RequestMapping(value="/Index", method = RequestMethod.GET)
	    public String StudentIndex(ModelMap model) {
	    	
	    	System.out.println("Inside Registration Form...");
	    	
	    	return "StudentRegistration";
	    	
	    }

}
