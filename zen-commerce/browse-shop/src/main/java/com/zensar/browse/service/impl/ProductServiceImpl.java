package com.zensar.browse.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
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

	
	@Override
	public List<Product> findByNameContaining(String productName, int pageNo, int pageSize) {
		PageRequest pageRequest = PageRequest.of(pageNo,pageSize,Direction.ASC,"name");
		return productRepository.findByNameContaining(productName,pageRequest);
	}
	   
}