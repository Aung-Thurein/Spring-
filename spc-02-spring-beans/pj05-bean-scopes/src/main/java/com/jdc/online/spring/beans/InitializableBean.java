package com.jdc.online.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class InitializableBean implements InitializingBean, DisposableBean{

	@PostConstruct
	private void postConstruct() 
	{
		System.out.println("Post Construct");
	}
	
	@PreDestroy
	private void preConstruct() 
	{
		System.out.println("Pre Construct");
	}
	
	@Override
	public void destroy() throws Exception 
	{
		System.out.println("Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("After Properties Set");
		
	}
	
	public void init()
	{
		System.out.println("Init Mehtod");
	}

	public void cleanUp()
	{
		System.out.println("Clean Up Method");
	}

	
}
