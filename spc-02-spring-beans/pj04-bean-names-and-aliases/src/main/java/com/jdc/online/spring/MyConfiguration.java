package com.jdc.online.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.online.spring.beans.MyService;
import com.jdc.online.spring.beans.MyServiceOne;

@Configuration
public class MyConfiguration {

	@Bean({
		"myService",
		"defaultService"
	})
	public MyService myService()
	{
		return new MyServiceOne();
	}
}
