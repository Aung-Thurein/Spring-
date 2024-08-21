package com.jdc.spring.autowired;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MyClient {

//Dependency
	
//	@Autowired
//	MyService service;

	private final MyService service;
	

	public void showMessage()
	{
		System.out.println(service.message());
	}
}
