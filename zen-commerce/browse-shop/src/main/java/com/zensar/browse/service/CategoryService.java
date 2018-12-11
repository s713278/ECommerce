package com.zensar.browse.service;

import java.util.List;

import com.zensar.browse.dto.Category;

public interface CategoryService {

	List<Category> getAllCategories();

	Category getCategory(long id);

	Category save(Category product);

}
