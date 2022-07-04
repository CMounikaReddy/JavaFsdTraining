package com.icici.sharemarket.service;

import java.util.List;
import com.icici.sharemarket.pojo.EmployeePojo;

public interface EmployeeService {
	
	EmployeePojo getEmployee(int empId);
	
	EmployeePojo saveEmployee(EmployeePojo employeePojo);
	
	EmployeePojo deleteEmployee(int empId);
	
	EmployeePojo editEmployee(EmployeePojo employeePojo);
	
	EmployeePojo listEmployee();
	
	List<EmployeePojo> getEmpByNameWithLike(String empname);

}