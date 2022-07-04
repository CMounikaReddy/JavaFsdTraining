package com.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organization.pojo.StudentPojo;
import com.organization.service.StudentService;

@RestController
@RequestMapping(path = "/students")
public class StudentRestController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(path="/getStudent", produces = "application/json")
    public StudentPojo getStudent() 
    {
		StudentPojo stdPojo = new StudentPojo();
		stdPojo.setName("Mounika");
		stdPojo.setAge(22);
		stdPojo.setCourse("BTech");
    	
		 return stdPojo;
    }
    
    @PostMapping(path="/StdRegistration", consumes = "application/json", produces = "application/json")
    public StudentPojo StdRegistration(@RequestBody StudentPojo stdPojo) 
    {
    	
    	System.out.println(stdPojo.getName() + " " + stdPojo.getAge());
    	System.out.println(stdPojo.getCourse());
    	
    	studentService.saveStudent(stdPojo);
    	
		 return stdPojo;
    }


}
