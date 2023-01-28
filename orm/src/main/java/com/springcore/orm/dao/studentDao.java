package com.springcore.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springcore.orm.entities.Student;

public class studentDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		int s = (Integer) this.hibernateTemplate.save(student);

		return s;

	}

	public Student getStudent(int ID) {
		Student student = this.hibernateTemplate.get(Student.class, ID);

		return student;
	}

	public List<Student> getAllStudent() {
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;

	}

	@Transactional
	public void delete(int ID) {
		Student student = this.hibernateTemplate.get(Student.class, ID);
		this.hibernateTemplate.delete(student);

	}

	@Transactional
	public void updateStudent(Student studentID) {
		this.hibernateTemplate.update(studentID);

	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
