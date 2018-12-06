package com.zensar.browse.facade;

import com.zensar.browse.dto.Product;

public interface ProductFacade {

	Product getProduct(long id);
	
	Iterable<Product> getAllProducts();

	Product save(Product product);

}
