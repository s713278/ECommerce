package com.zensar.browse.facade;

import java.util.List;

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

	@Override
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@Override
	public Product save(Product product) {
		return productService.save(product);
	}
	
	

}
