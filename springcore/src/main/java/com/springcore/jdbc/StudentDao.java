package com.springcore.jdbc;

import java.util.List;

public interface StudentDao {
	public int insert(Student student);
	
	public int chnge(Student student);
	
	public Student getStudent(int Id);

	public List<Student> getAllStudent();



}
