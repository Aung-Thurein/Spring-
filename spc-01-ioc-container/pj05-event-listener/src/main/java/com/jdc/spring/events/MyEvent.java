package com.jdc.spring.events;

import java.time.LocalDateTime;

public record MyEvent(
		String name, LocalDateTime publishAt) {

	
	public MyEvent(String name) {
		this(name, LocalDateTime.now());
	}
}
