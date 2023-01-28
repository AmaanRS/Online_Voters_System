package com.springcore.pjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runn {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/pjdbc/pconfig.xml");
		StdDaoImpl con = (StdDaoImpl) context.getBean("stdDaoImpl");

		System.out.println(con.getStudent(2)); 
		
		

	}

}
