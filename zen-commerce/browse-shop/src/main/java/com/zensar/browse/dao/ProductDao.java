package com.zensar.browse.dao;

import org.springframework.data.repository.CrudRepository;

import com.zensar.browse.dto.Product;

public interface ProductDao extends CrudRepository<Product, Long>  {
}