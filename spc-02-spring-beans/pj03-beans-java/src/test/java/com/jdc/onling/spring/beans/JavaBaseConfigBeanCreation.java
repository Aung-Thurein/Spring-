package com.jdc.onling.spring.beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.online.spring.MyConfiguration;
import com.jdc.online.spring.beans.MyService;

public class JavaBaseConfigBeanCreation {

	@Test
	public void test()
	{
		try(var context = new AnnotationConfigApplicationContext(MyConfiguration.class))
		{
			var bean = context.getBean(MyService.class);
			
			System.out.println(bean.message());
		}
	}
}
