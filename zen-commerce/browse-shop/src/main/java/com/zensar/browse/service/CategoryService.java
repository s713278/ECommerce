package com.zensar.browse.service;

import com.zensar.browse.dto.Category;

public interface CategoryService {

	Iterable<Category> getAllCategories();

	Category getCategory(long id);

	Category save(Category product);

}
