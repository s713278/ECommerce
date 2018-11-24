package com.zensar.browse.service;

import com.zensar.browse.dto.Product;

public interface ProductService {

	Iterable<Product> getAllProducts();

	Product getProduct(long id);

	Product save(Product product);

}
