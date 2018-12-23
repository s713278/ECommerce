package com.zensar.browse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zensar.browse.dao.CategoryDao;
import com.zensar.browse.dto.Category;
import com.zensar.browse.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryRepository;
	private int pageNumber =1;
	private int PAGESIZE =25;
	
	@Override
	public Category getCategory(long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Page<Category> getAllCategories(Pageable pageable) {
		PageRequest request = PageRequest.of(pageable.getPageNumber()  - 1, pageable.getPageSize(), Sort.Direction.ASC, "id");
		return categoryRepository.findAll(request);
	}
}
