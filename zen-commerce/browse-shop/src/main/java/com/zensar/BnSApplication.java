
package com.zensar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com","com.zensar.browse.controller","com.zensar.discovery.controller"})
@EnableEurekaClient	
public class BnSApplication {

    public static void main(String[] args) {
        SpringApplication.run(BnSApplication.class, args);
    }
    
}