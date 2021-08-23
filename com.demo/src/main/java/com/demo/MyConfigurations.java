package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurations {
	
	@Bean
	public Helloworld helloworld() {
		return new Helloworld();
	}

}
