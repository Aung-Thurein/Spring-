package com.jdc.spring.events;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({
	"com.jdc.spring.events.publisher",
	"com.jdc.spring.events.listener"
})

public class ApplicationConfig {

}