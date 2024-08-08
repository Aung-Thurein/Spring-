package com.jdc.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.ioc.bean.AnnotatedBean;

public class HelloBeanTest {

	@Test
	public void test()
	{
		try(var context = new AnnotationConfigApplicationContext(ApplicationConfig.class))
		{
			var bean = context.getBean(HelloBean.class);
			System.out.println(bean.sayHello());
			
			var annotatedBean = context.getBean(AnnotatedBean.class);
			System.out.println(annotatedBean.sayHello());
		}
	}
}
