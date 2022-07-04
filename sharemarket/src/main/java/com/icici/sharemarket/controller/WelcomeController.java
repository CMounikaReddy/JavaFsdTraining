package com.icici.sharemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @RequestMapping(value="/ShowEmployeeRegistrationForm", method = RequestMethod.GET)
    public String EmployeeReg(ModelMap model) {
    	
    	System.out.println("Inside Form...");
    	
    	return "EmployeeRegistrationForm";
    	
    }

}