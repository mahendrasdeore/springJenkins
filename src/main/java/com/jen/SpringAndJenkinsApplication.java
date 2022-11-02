package com.jen;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAndJenkinsApplication {

	public static Logger logger=LoggerFactory.getLogger(SpringAndJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started");
	}
	
	public static void main(String[] args) {
		
		logger.info("Application executed");
		
		SpringApplication.run(SpringAndJenkinsApplication.class, args);
	}

}
