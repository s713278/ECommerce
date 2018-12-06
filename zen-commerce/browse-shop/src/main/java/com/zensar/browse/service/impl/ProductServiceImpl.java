package com.zensar.browse.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.browse.dao.ProductDao;
import com.zensar.browse.dto.Product;
import com.zensar.browse.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
 
	@Autowired
	ProductDao productRepository;

	public List<Product> getAllProducts() {
		List<Product> mutableList = new ArrayList<>();
		for (Product p : productRepository.findAll()) {
			mutableList.add(p);
		}
		return mutableList;
	}

	public Product getProduct(long id) {
		if (productRepository.findById(id).isPresent()){
			return productRepository.findById(id).get();
		}
		return null;
	}

	public Product save(Product product) {
		return productRepository.save(product);
	}
	   
}