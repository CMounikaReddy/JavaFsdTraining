package com.organization.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.entity.Student;
import com.organization.pojo.StudentPojo;
import com.organization.repository.StudentRepository;

@Transactional
@Service("studentservice")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentPojo getStudent(int rollno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentPojo updateStudent(StudentPojo stdPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentPojo deleteStudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentPojo saveStudent(StudentPojo studPojo) {
		
		System.out.println("Returning From Service....  " + studPojo.getName());
		
		Student student = new Student();
		student.setName(studPojo.getName());
		student.setAge(studPojo.getAge());
		student.setCourse(studPojo.getCourse());
		
		studentRepository.save(student);
		
		studPojo.setRollno(student.getRollno());
		
		return studPojo;
	}
	
	

}
