package com.icici.sharemarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeePojo {
	
	private String empname;
	private int age;
	private int empId;
	private String status;
	
	private List<EmployeePojo> listEmp = new ArrayList<EmployeePojo>();
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<EmployeePojo> getListEmp() {
		return listEmp;
	}
	public void setListEmp(List<EmployeePojo> listEmp) {
		this.listEmp = listEmp;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
