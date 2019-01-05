package com.zensar.browse.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.zensar.browse.dto.Category;

public interface CategoryService {


	Category getCategory(long id);

	Category save(Category product);

	List<Category> getAllCategories(Pageable pageable);

}
