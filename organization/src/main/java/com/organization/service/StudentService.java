package com.organization.service;

import com.organization.pojo.StudentPojo;

public interface StudentService {
	
	StudentPojo getStudent(int rollno);
	
	StudentPojo updateStudent(StudentPojo stdPojo);
	
	StudentPojo deleteStudent(String name);
	
	StudentPojo saveStudent(StudentPojo stdPojo);

}
