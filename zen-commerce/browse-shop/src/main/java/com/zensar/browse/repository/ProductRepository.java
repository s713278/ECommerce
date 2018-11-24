package com.zensar.browse.repository;

import org.springframework.data.repository.CrudRepository;

import com.zensar.browse.dto.Product;

public interface ProductRepository extends CrudRepository<Product, Long>  {
}