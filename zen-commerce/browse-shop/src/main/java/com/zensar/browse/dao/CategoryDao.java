package com.zensar.browse.dao;

import org.springframework.data.repository.CrudRepository;

import com.zensar.browse.dto.Category;

public interface CategoryDao extends CrudRepository<Category, Long>  {
}