package com.api.booking.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.api.booking" })
@EnableCaching
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(applicationclass, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationclass);

	}

	private static Class<Application> applicationclass = Application.class;
}
