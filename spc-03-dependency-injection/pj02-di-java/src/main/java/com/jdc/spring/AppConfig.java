package com.jdc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.spring.di.MyClient;
import com.jdc.spring.di.MyService;

@Configuration
public class AppConfig {

	@Bean(name = "service")
	MyService service()
	{
		return new MyService();
	}
	
	@Bean(name = "client1")
	MyClient client1()
	{
		MyClient bean = new MyClient(service());
		bean.setName("Client 1");
		return bean;
	}
	
	@Bean(name = "client2")
	MyClient client2()
	{
		MyClient bean = new MyClient();
		bean.setMyService(service());
		bean.setName("Client 2");
		
		return bean;
	}
}
