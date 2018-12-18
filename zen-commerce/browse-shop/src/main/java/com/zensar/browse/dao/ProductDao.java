package com.zensar.browse.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.zensar.browse.dto.Product;

public interface ProductDao extends CrudRepository<Product, Long>  {

	List<Product> findByNameContaining(String name, Pageable pageable);
}