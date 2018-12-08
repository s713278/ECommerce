package com.zensar.zenserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZenServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZenServiceRegistryApplication.class, args);
	}
}
