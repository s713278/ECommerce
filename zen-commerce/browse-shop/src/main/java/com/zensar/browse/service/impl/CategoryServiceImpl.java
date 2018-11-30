package com.zensar.browse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zensar.browse.dao.CategoryDao;
import com.zensar.browse.dto.Category;
import com.zensar.browse.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryRepository;
	
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
