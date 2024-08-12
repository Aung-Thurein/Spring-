package com.jdc.ioc;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {

	public String sayHello()
	{
		return "Hello From Annotation config spring bean.";
	}

}
