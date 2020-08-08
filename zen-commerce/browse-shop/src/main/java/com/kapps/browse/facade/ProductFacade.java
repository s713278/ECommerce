package com.kapps.browse.facade;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.kapps.browse.entity.Category;
import com.kapps.browse.entity.Product;
import com.kapps.browse.entity.Sku;

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
