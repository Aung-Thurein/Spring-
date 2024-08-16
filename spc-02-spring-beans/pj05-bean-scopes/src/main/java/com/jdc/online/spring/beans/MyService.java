package com.jdc.online.spring.beans;

import java.util.ArrayList;
import java.util.List;

public class MyService {

	private List<String> messages = new ArrayList<String>();
	
	public List<String> getMessage()
	{
		return List.copyOf(messages);
	}
	
	public void addMessage(String message)
	{
		messages.add(message);
	}
}

