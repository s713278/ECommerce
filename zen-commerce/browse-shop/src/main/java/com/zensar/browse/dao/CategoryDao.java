package com.zensar.browse.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.zensar.browse.dto.Category;

public interface CategoryDao extends PagingAndSortingRepository<Category, Long>  {

}