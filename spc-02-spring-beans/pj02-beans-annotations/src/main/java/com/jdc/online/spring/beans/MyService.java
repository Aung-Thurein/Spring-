package com.jdc.online.spring.beans;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	String message()
	{
		return "Hello From Annotation Base Bean";
	}
}
