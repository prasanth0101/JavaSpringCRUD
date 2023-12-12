package com.student.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public class StudentRepositery {
	Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
	SessionFactory sf = cfg.buildSessionFactory();
	
	public Student findById(int id) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Student student = session.get(Student.class, id);
		session.close();
		session.close();
		return student;
		
	}
	
	
	public void setStudent(Student student) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(student);
		trans.commit();
		session.close();
	}
	
	public List<Student> getAllStudent() {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Student> studentAllList = query.getResultList();
		trans.commit();
		session.close();
		return studentAllList;
		
	}
	public void updateStudent(int id) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Student student = new StudentRepositery().findById(id);
		
		//dfadafada
		
		
	}
	public void deleteStudent(int id) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Student student = new StudentRepositery().findById(id);
		session.delete(student);
		trans.commit();
		session.close();
		
	}
	
	
	
}
