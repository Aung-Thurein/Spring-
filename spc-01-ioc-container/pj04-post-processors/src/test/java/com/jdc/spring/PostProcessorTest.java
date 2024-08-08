package com.jdc.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.spring.beans.MyBean;

public class PostProcessorTest {

	@Test
	public void test()
	{
		try(var context = new AnnotationConfigApplicationContext("com.jdc.spring"))
		{
			var bean = context.getBean(MyBean.class);
			System.out.println(bean.getValue());
		}
	}
}
