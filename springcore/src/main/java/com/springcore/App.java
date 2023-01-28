package com.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.collect.Emp;
import com.springcore.jdbc.Student;
import com.springcore.jdbc.StudentDao;
import com.springcore.jdbc.StudentDaoImpl;
import com.springcore.lyf.Compon;
import com.springcore.lyf.ntmethods;
import com.springcore.lyf.wred;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student student =(Student) context.getBean("student1");
//        System.out.println(student);
//        
//        
//        ApplicationContext ncontext = new ClassPathXmlApplicationContext("com/springcore/collect/collectconfig.xml");
//        Emp emp = (Emp) ncontext.getBean("Emp22");
//        System.out.println(emp);
//        System.out.println(emp.getNames());
//        System.out.println(emp.getClass());
//        System.out.println(emp.getCourses());
//        System.out.println(emp.getPhones());

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Emp emp = (Emp) context.getBean("Emp22");
////        System.out.println(emp);
//        System.out.println(emp.getStudent().toString());

//    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//    	ntmethods ntm = (ntmethods) context.getBean("ntm");
//    	System.out.println(ntm.getClass());
//    	System.out.println(ntm);
//    	context.registerShutdownHook();

//    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//    	ntmethods ntm = (ntmethods) context.getBean("ntmm");
//    	System.out.println(ntm.getClass());
//    	System.out.println(ntm);
//    	context.registerShutdownHook();

//    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//    	wred ggg =  (wred) context.getBean("ggg");
////    	System.out.println(ntm.getClass());
//    	System.out.println(ggg);
//    	System.out.println(ggg.getN().getClass());

//    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//    	Compon ggg =  (Compon) context.getBean("hhh");
////    	System.out.println(ntm.getClass());
//    	System.out.println(ggg);
//    	System.out.println(ggg.getClass());

//      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//      JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//      
//
//      String query = "insert into student values (?,?,?)";
//      
//      int n=template.update(query,2,"xxxx",32);
//      System.out.println(n);
//    	

//    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        StudentDao studentD = context.getBean("studentD",StudentDao.class);
//        
//        com.springcore.jdbc.Student s = new com.springcore.jdbc.Student(3,"Hrsh",37);
//        
//        int p =studentD.insert(s);
//        System.out.println(p);

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        StudentDao studentD = context.getBean("studentD",StudentDao.class);
//        
//        com.springcore.jdbc.Student s = new com.springcore.jdbc.Student(3,"plghr",99999);
//        
//        int p =studentD.chnge(s);
//        System.out.println(p);

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        StudentDao studentD = context.getBean("studentD",StudentDao.class);
//        
//        System.out.println(studentD.getStudent(1));

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//       StudentDao studentD = context.getBean("studentD",StudentDao.class);
		StudentDao studentD = context.getBean("studentD", StudentDao.class);
		List<com.springcore.jdbc.Student> students = studentD.getAllStudent();
		for (Student s : students) {
			System.out.println(s);

		}

	}
}
