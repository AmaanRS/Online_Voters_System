package com.springcore.collect;

import java.util.List;
import java.util.Map;

import com.springcore.Student;


public class Emp {
	private String names;
	private List<String> phones;
	private Map<String ,String> courses;
	private Student student;
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Override
	public String toString() {
		return "Emp [names=" + names + ", phones=" + phones + ", courses=" + courses + ", student=" + student + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String names, List<String> phones, Map<String, String> courses, Student student) {
		super();
		this.names = names;
		this.phones = phones;
		this.courses = courses;
		this.student = student;
	}
	
	
	

	
}
