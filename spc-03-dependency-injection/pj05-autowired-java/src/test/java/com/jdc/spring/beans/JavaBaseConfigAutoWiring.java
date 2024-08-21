package com.jdc.spring.beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBaseConfigAutoWiring {

	@Test
	void demo()
	{
		try(var context = new AnnotationConfigApplicationContext("com.jdc.spring"))
		{
			var client = context.getBean(MyClient.class);
			client.showMessage();
		}
	}
}
