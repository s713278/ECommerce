package com.zensar.browse.facade;

import java.util.List;

import com.zensar.browse.dto.Product;

public interface ProductFacade {

	Product getProduct(long id);
	
	List<Product> getAllProducts();

	Product save(Product product);

}
