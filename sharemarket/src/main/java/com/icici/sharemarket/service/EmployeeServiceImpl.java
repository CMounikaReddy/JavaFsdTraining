package com.icici.sharemarket.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icici.sharemarket.entity.Employee;
import com.icici.sharemarket.pojo.EmployeePojo;
import com.icici.sharemarket.repository.EmployeeRepository;

@Transactional
@Service("employeeservice")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	EmployeePojo emppojo = new EmployeePojo();
	
	@Override
	public EmployeePojo getEmployee(int empId) {
		
		try {
		Employee employee = employeeRepository.getReferenceById(empId);
		emppojo.setEmpId(employee.getEmpId());
		emppojo.setEmpname(employee.getEmpname());
		emppojo.setAge(employee.getAge());
		
		}catch(EntityNotFoundException e) {
			emppojo.setStatus("Emp Id not found");
		}
		catch(Exception e) {
			emppojo.setStatus("Please try after some time");
		}
		return emppojo;
	}

	@Override
	public EmployeePojo saveEmployee(EmployeePojo employeePojo) {
		// Sending email, sms
		// generating empId
		// checking bank balance
		System.out.println("From Service...." + employeePojo.getEmpname());
		
		Employee employee = new Employee();
		employee.setEmpname(employeePojo.getEmpname());
		employee.setAge(employeePojo.getAge());
		
		employeeRepository.save(employee);
		
		employeePojo.setEmpId(employee.getEmpId());
		
		return employeePojo;
	}

	@Override
	public EmployeePojo deleteEmployee(int empId) {
		
		employeeRepository.deleteById(empId);
		emppojo.setEmpId(empId);
		emppojo.setStatus("Deleted");
		
		return emppojo;
	}

	
	@Override
	public EmployeePojo editEmployee(EmployeePojo employeePojo) {
		
		Employee employee = employeeRepository.getReferenceById(employeePojo.getEmpId());
		employee.setAge(employeePojo.getAge());
		employee.setEmpname(employeePojo.getEmpname());
	
		return employeePojo;
	}

	
	@Override
	public EmployeePojo listEmployee() {
		
		List<EmployeePojo> listEmppojo = new ArrayList();
		List<Employee> listEmployee = new ArrayList();
		
		try {
			
			listEmployee = employeeRepository.findAll();
			
			for(Employee employee:listEmployee) {
				EmployeePojo emppojoobj = new EmployeePojo();
				emppojoobj.setEmpId(employee.getEmpId());
				emppojoobj.setEmpname(employee.getEmpname());
				emppojoobj.setAge(employee.getAge());
				
				listEmppojo.add(emppojoobj);
			}
			emppojo.setListEmp(listEmppojo);
		}
		catch(Exception e) {
			emppojo.setStatus("Please try after some time");
		}
		
		return emppojo;
	}

	@Override
	public List<EmployeePojo> getEmpByNameWithLike(String empname) {
		
		List<EmployeePojo> listEmppojo = new ArrayList();
		List<Employee> listEmployee = new ArrayList();
		
		listEmppojo = employeeRepository.findall();
		
		return null;
	}
	
	
	

}
