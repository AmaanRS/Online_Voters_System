package com.springcore.jdbc;

public class Student {
	private int Id;
	private String name;
	private int rollno;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", rollno=" + rollno + "]";
	}

	public Student(int id, String name, int rollno) {
		super();
		Id = id;
		this.name = name;
		this.rollno = rollno;
	}
	
	

}
