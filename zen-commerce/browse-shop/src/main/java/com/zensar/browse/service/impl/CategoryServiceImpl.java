package com.zensar.browse.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zensar.browse.dao.CategoryDao;
import com.zensar.browse.dto.Category;
import com.zensar.browse.service.CategoryService;

@Service
@Scope("singleton")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryRepository;
	private int pageNumber =1;
	private int PAGESIZE =25;
	
	public CategoryServiceImpl() {
	System.out.println(" CategoryServiceImpl >>>> Default constructor loaded");	
	}
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
	
	@PostConstruct
	private void doStartUp() {
		System.out.println("CategoryServiceImpl >>>> After constuctor");
	}
	
	@PreDestroy
	private void doEnd() {
		System.out.println("CategoryServiceImpl >>>> After application context close...");
	}
}
