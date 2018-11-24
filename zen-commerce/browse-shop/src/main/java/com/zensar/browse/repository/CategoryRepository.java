package com.zensar.browse.repository;

import org.springframework.data.repository.CrudRepository;

import com.zensar.browse.dto.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>  {
}