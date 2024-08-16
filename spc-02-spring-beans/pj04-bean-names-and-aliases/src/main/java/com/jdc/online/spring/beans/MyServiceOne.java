package com.jdc.online.spring.beans;

public class MyServiceOne implements MyService{

	@Override
	public String message() {
		
		return "Message From ServiceOne";
	}

}
