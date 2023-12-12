package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "student")
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String StudentContact;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentContact() {
		return StudentContact;
	}
	public void setStudentContact(String studentContact) {
		StudentContact = studentContact;
	}
	
	
	
	
	
}
