package com.icici.sharemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icici.sharemarket.entity.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	
}
