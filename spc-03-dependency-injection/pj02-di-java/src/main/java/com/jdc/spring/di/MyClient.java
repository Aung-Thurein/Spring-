package com.jdc.spring.di;

public class MyClient {

	//Dependency
	MyService myService;
	private String name;
	
	
	public MyClient()
	{
		
	}
	public MyClient (MyService myService)
	{
		this.myService = myService;
	}
	
	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showMessage()
	{
		System.out.println("%s -> %s".formatted(name,myService.messaege()));
	}
	
	
}
