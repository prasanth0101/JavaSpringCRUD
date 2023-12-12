package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repo.StudentRepositery;

@Service
public class StudentService {
	@Autowired
	StudentRepositery studentRepositery;
	@Autowired
	Student student;
	
	public void setStudent(int id,String name,String contact) {
		
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentContact(contact);
		student.setStudentName(name);
		
		studentRepositery.setStudent(student);
		
	}

	public List<Student> getAllData() {
		return studentRepositery.getAllStudent();
	}

}
