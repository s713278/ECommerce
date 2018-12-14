
package com.zensar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@ComponentScan(basePackages={"com","com.zensar.browse.controller","com.zensar.discovery.controller"})
@EnableEurekaClient
@EnableScheduling
public class BnSApplication {

    public static void main(String[] args) {
        SpringApplication.run(BnSApplication.class, args);
    }
    
    @Scheduled(fixedDelay =1000)
    public static void m1() {
    	System.out.println("#######################"+System.currentTimeMillis());
    }
}