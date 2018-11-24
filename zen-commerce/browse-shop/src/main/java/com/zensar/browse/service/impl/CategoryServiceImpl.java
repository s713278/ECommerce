package com.zensar.browse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zensar.browse.dto.Category;
import com.zensar.browse.repository.CategoryRepository;
import com.zensar.browse.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Iterable<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategory(long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

}
