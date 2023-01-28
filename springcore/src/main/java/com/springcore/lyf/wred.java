package com.springcore.lyf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class wred {
	
	
	private String name;
	private String ress;
	@Autowired
	@Qualifier("ntm")
	private ntmethods n;

	public wred() {
		super();
		// TODO Auto-generated constructor stub
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

	public ntmethods getN() {
		return n;
	}

	public void setN(ntmethods n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "wred [name=" + name + ", ress=" + ress + ", n=" + n + "]";
	}

	public wred(String name, String ress, ntmethods n) {
		super();
		this.name = name;
		this.ress = ress;
		this.n = n;
	}
	
	
	

}
