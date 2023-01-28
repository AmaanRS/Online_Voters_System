package com.springcore.lyf;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class ntmethods {
	
	private String name;
	private String ress;
	public ntmethods(String name, String ress) {
		super();
		this.name = name;
		this.ress = ress;
	}
	public ntmethods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ntmethods [name=" + name + ", ress=" + ress + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRess() {
		return ress;
	}
	public void setRess(String ress) {
		this.ress = ress;
	}
//	public void init() {
//		System.out.println("This is init method");
//	}
//	public void destroy() {
//		System.out.println("This is destroy method");
//
//	}
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("init");
//		
//	}
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("This is destroy method");
//		
//	}

}
