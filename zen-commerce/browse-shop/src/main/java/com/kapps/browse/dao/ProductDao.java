package com.kapps.browse.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.kapps.browse.dto.Product;

public interface ProductDao extends PagingAndSortingRepository<Product, Long>  {

	List<Product> findByNameContaining(String name, Pageable pageable);
}