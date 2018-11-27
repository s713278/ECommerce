package com.zensar.browse.facade;

import org.springframework.beans.factory.annotation.Autowired;

import com.zensar.browse.dto.Product;
import com.zensar.browse.service.ProductService;

public class ProductFacadeImpl implements ProductFacade {

	@Autowired
	ProductService productService;
	
	@Override
	public Product getProduct(long id) {
		return productService.getProduct(id);
	}

}
