package com.example.redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
 

@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class RedisDemoApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RedisDemoApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
	}
}
