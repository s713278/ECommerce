package com.zensar.browse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig  {
		
	 @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.regex("/.*"))
	                .build()
	                .apiInfo(apiInfo());
	    }
	 
		private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("Spring REST Sample with Swagger")
	                .description("Spring REST Sample with Swagger")
	                .termsOfServiceUrl("#")
	                .contact(new Contact("Swamy Kunta", "", "swamy.kunta@gmail.com"))
	                .license("##")
	                .licenseUrl("https://github.com/s713278/ECommerce")
	                .version("2.0")
	                .build();
	    }
		
		
}