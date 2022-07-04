package com.icici.sharemarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.sharemarket.pojo.EmployeePojo;
import com.icici.sharemarket.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeRestController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(path="/getEmployee", produces = "application/json")
	    public EmployeePojo getEmployees() 
	    {
	    	EmployeePojo empPojo = new EmployeePojo();
	    	empPojo.setEmpname("Jin");
	    	empPojo.setAge(30);
	    	empPojo.setStatus("Accepted");
	    	
			 return empPojo;
	    }
	    
	    @PostMapping(path="/EmpRegistration", consumes = "application/json", produces = "application/json")
	    public EmployeePojo EmpRegistration(@RequestBody EmployeePojo emppojo) 
	    {
	    	
	    	System.out.println(emppojo.getEmpname());
	    	System.out.println(emppojo.getAge());
	    	employeeService.saveEmployee(emppojo);
			 return emppojo;
	    }
	    
	    @GetMapping(path="/getEmp/{id}", produces= "application/json")
	    public EmployeePojo getemp(@PathVariable Integer id) {
	       
	    	EmployeePojo emppojo = employeeService.getEmployee(id);
	        
	        return emppojo;
	    }
	    
	    @GetMapping(path="/getListofEmp", produces= "application/json")
	    public EmployeePojo getListEmp() {
	       
	    	EmployeePojo emppojo = employeeService.listEmployee();
	        
	        return emppojo;
	    }
	    
	    @PutMapping(path="/updateEmp", consumes = "application/json", produces = "application/json")
	    public EmployeePojo updateEmp(@RequestBody EmployeePojo empPojo) 
	    {
	    	employeeService.editEmployee(empPojo);
	    	empPojo = employeeService.getEmployee(empPojo.getEmpId());
	    	
			 return empPojo;
	    }
	    
	    @DeleteMapping(path="/deleteEmp/{id}", produces = "application/json")
	    public EmployeePojo deleteEmp(@PathVariable Integer id) 
	    {
	    	EmployeePojo emppojo = employeeService.deleteEmployee(id);
	    	
			 return emppojo;
	    }

}