package com.jdc.spring.beans;

public class MyServiceFactory {

	public MyService myService()
	{
		return new MyService("Return From Instance Factory Method");
	}
}
