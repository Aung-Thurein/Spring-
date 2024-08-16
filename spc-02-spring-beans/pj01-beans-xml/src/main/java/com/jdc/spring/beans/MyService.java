package com.jdc.spring.beans;

public class MyService {

	private String message;
	
	public MyService(String message) {
		
		this.message = message;
	}
	
	
	public String message()
	{
		return message;
	}
}
