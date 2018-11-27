package com.zensar.browse.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.browse.dto.Product;
import com.zensar.browse.facade.ProductFacade;
import com.zensar.browse.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductFacade productFacade;
 
    // productService constructor injection
 
    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
    
    @GetMapping(value = { "", "/{productId}" })
    @ResponseBody
    public Product getProduct(@PathVariable long productId) {
    	return productFacade.getProduct(productId);
    }
}