package com.springcore.lyf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hhh")
public class Compon {
	@Value("#{ggg}")
	private wred wred;

	public wred getWred() {
		return wred;
	}

	public void setWred(wred wred) {
		this.wred = wred;
	}

	@Override
	public String toString() {
		return "Compon [wred=" + wred + "]";
	}

	public Compon(com.springcore.lyf.wred wred) {
		super();
		this.wred = wred;
	}

	public Compon() {
		super();
		// TODO Auto-generated constructor stub
	} 

	
}
