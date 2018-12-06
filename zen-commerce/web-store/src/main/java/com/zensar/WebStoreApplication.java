package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.zensar","com.zensar.webstore"})
public class WebStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStoreApplication.class, args);	
	}
	
	
}
