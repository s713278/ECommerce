package com.kapps.browse.service;

import java.util.List;

import com.kapps.browse.dto.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProduct(long id);

	Product save(Product product);
	
	List<Product> findByNameContaining(String name,int pageNo,int pageSize);
	
}
