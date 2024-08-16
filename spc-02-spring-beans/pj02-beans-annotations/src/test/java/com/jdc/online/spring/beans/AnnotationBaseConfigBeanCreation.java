package com.jdc.online.spring.beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBaseConfigBeanCreation {
	@Test
	void test()
	{
		try(var context = new AnnotationConfigApplicationContext("com.jdc.online.spring.beans"))
		{
			var bean = context.getBean(MyService.class);
			
			System.out.println(bean.message());
		}
	}
}
