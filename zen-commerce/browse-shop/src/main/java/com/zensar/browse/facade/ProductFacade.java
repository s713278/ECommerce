package com.zensar.browse.facade;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.zensar.browse.dto.Category;
import com.zensar.browse.dto.Product;
import com.zensar.browse.dto.Sku;

/**
 * 
 * @author Swamy Kunta
 *
 */
public interface ProductFacade {

	Product getProduct(long id);
	
	List<Product> getAllProducts();

	Product save(Product product);

	Category getCategory(long categoryId);

	Sku getSku(String id);

	Category save(Category category);
	
	List<Product> findByNameContaining(String productName, int pageNo, int pageSize);

	List<Category> getAllCategories(Pageable pageable);
}
