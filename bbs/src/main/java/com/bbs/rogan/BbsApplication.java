package com.bbs.rogan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication
public class BbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbsApplication.class, args);
		
		System.out.println("please login");
		System.out.println("test");
	}
	
	public void addbiewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/contentSample").setViewName("contentSample");
	}
}	