package com.kapps.browse.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.kapps.browse.entity.Category;

public interface CategoryService {


	Category getCategory(long id);

	Category save(Category product);

	List<Category> getAllCategories(Pageable pageable);

}
