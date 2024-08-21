package com.jdc.spring.autowired;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AutoWiringDemo {

	@Test
	void demo()
	{
		try(var context = new GenericXmlApplicationContext("classpath:/application.xml"))
		{
			var bean = context.getBean(MyClient.class);
			bean.showMessage();
		}
	}
}
