package com.kapps.browse.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import com.kapps.browse.entity.Category;
import com.kapps.browse.entity.Product;
import com.kapps.browse.entity.Sku;
import com.kapps.browse.service.CategoryService;
import com.kapps.browse.service.ProductService;
import com.kapps.browse.service.SkuService;

public class ProductFacadeImpl implements ProductFacade {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;

	@Autowired
	private SkuService skuService;
	
	
	@Override
	public Product getProduct(long id) {
		return productService.getProduct(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@Override
	public Product save(Product product) {
		return productService.save(product);
	}

	@Override
	public List<Category> getAllCategories(Pageable pageable) {
		return categoryService.getAllCategories(pageable);
	}

	@Override
	public Category getCategory(long categoryId) {
		return categoryService.getCategory(categoryId);
	}
	
	@Override
	public Sku getSku(String id){
		return skuService.getSku(id);
	}

	@Override
	public Category save(Category category) {
		return categoryService.save(category);
	}

	@Override
	public List<Product> findByNameContaining(String productName, int pageNo, int pageSize) {
		return productService.findByNameContaining(productName, pageNo, pageSize);
	}
	
}
