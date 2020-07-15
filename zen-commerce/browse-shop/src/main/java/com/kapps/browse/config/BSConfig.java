package com.kapps.browse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kapps.browse.facade.ProductFacade;
import com.kapps.browse.facade.ProductFacadeImpl;

@Configuration
public class BSConfig {

	@Bean
	public ProductFacade productFacade() {
		return new ProductFacadeImpl();
	}
}
