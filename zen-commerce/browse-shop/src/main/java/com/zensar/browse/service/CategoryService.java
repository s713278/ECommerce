package com.zensar.browse.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zensar.browse.dto.Category;

public interface CategoryService {


	Category getCategory(long id);

	Category save(Category product);

	Page<Category> getAllCategories(Pageable pageable);

}
