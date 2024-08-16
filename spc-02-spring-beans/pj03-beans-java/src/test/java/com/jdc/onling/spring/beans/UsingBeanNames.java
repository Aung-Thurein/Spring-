package com.jdc.onling.spring.beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.online.spring.MyConfiguration;

public class UsingBeanNames {
	
	@Test
	public void test()
	{
		try(var context = new AnnotationConfigApplicationContext(MyConfiguration.class))
		{
			var factory  = context.getBeanFactory();
			
			for(var name : factory.getBeanDefinitionNames())
			{
				System.out.println(name);
				
				var aliases = factory.getAliases(name);
				
				for(var alias : aliases)
				{
					System.out.println("Alias of %s is %s%n".formatted(name,alias));
				}
			}
		}
	}
}
