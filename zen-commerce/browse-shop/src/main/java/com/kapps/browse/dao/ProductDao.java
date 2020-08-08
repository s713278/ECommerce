package com.kapps.browse.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.kapps.browse.entity.Product;

public interface ProductDao extends PagingAndSortingRepository<Product, Long>  {

	List<Product> findByNameContaining(String name, Pageable pageable);
}