package com.jdc.spring.context;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.spring.events.ApplicationConfig;
import com.jdc.spring.events.MyEvent;
import com.jdc.spring.events.publisher.MyEventPublisher;

public class ContextEventListenerDemo {

	@Test
	public void test()
	{
		try(var context = new AnnotationConfigApplicationContext(ApplicationConfig.class))
		{
			var bean = context.getBean(MyEventPublisher.class);
			bean.publish(new MyEvent("My First Event"));
			bean.publish(new MyEvent("My Second Event"));
		}
	}
}
