package com.springorm.introduction;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
	
	HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		Integer i = (Integer)hibernateTemplate.save(student);
		return i;
	}
	
	//SELECT a single Student
	public Student getStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	
	//SELECT a list of Student
	public List<Student> getAllStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//DELETE single record(When we perform write operation in DB , it is necessary to declare @Transactional)
	@Transactional
	public void deleteStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}
	
	//UPDATE student (When we perform write operation in DB , it is necessary to declare @Transactional)
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
