package com.jdc.spring.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExplictWritingDemo {

	@Test
	void demo()
	{
		try(var context = new AnnotationConfigApplicationContext("com.jdc.spring"))
		{
			var client1 = context.getBean("client1", MyClient.class);
			client1.showMessage();
			
			var client2 = context.getBean("client2", MyClient.class);
			client2.showMessage();
		}
	}
}
