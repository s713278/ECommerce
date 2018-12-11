package com.zensar.browse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.browse.facade.ProductFacade;
import com.zensar.browse.facade.ProductFacadeImpl;
import com.zensar.browse.service.CategoryService;
import com.zensar.browse.service.ProductService;
import com.zensar.browse.service.SkuService;
import com.zensar.browse.service.impl.CategoryServiceImpl;
import com.zensar.browse.service.impl.ProductServiceImpl;
import com.zensar.browse.service.impl.SkuServiceImpl;

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
	
	@Bean
	public CategoryService CategoryService(){
		return new CategoryServiceImpl();
	}
	
	@Bean
	public SkuService SkuService(){
		return new SkuServiceImpl();
	}
}
