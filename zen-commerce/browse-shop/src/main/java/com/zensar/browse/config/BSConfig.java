package com.zensar.browse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.browse.facade.ProductFacade;
import com.zensar.browse.facade.ProductFacadeImpl;

@Configuration
public class BSConfig {

	@Bean
	public ProductFacade productFacade() {
		return new ProductFacadeImpl();
	}
}
