
package com.zensar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;

import com.zensar.browse.service.CategoryService;

@SpringBootApplication
@ComponentScan(basePackages={"com","com.zensar.browse.controller","com.zensar.discovery.controller"})
@EnableEurekaClient
//@EnableScheduling
public class BnSApplication {

    public static void main(String[] args) {
    	 ConfigurableApplicationContext context= SpringApplication.run(BnSApplication.class, args);
    	CategoryService categoryService = context.getBean("ategoryService",CategoryService.class);
    }
    
    @Scheduled(fixedDelay =1000)
    public static void m1() {
    	System.out.println("#######################"+System.currentTimeMillis());
    }
}