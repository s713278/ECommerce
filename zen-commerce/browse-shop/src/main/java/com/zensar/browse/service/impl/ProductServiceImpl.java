package com.zensar.browse.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.browse.dto.Product;
import com.zensar.browse.repository.ProductRepository;
import com.zensar.browse.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
 
    // productRepository constructor injection
 
	@Autowired
	ProductRepository productRepository;

	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProduct(long id) {
		return productRepository.findById(id).get();
	}

	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	
   
}