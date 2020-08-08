package com.kapps.browse.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kapps.browse.entity.Category;

public interface CategoryDao extends PagingAndSortingRepository<Category, Long>  {

}