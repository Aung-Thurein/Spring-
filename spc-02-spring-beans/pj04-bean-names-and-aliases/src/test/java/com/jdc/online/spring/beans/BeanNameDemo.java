package com.jdc.online.spring.beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.online.spring.MyConfiguration;

public class BeanNameDemo {

	@Test
	public void test()
	{
		try(var context = new AnnotationConfigApplicationContext(MyConfiguration.class))
		{
			var bean = context.getBean("defaultService");
			
			if(bean instanceof MyService myService)
			{
				System.out.println(myService.message());
			}
		}
	}
}
