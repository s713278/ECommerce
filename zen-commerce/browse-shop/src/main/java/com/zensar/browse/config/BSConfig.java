package com.zensar.browse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.browse.facade.ProductFacade;
import com.zensar.browse.facade.ProductFacadeImpl;
import com.zensar.browse.service.ProductService;
import com.zensar.browse.service.impl.ProductServiceImpl;

@Configuration
public class BSConfig {

	@Bean
	public ProductFacade productFacade() {
		return new ProductFacadeImpl();
	}
	
	@Bean
	public ProductService productService() {
		return new ProductServiceImpl();
	}
}
