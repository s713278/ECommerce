package com.zensar.browse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.browse.dto.Category;
import com.zensar.browse.dto.Product;
import com.zensar.browse.facade.ProductFacade;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	
	@Autowired
	private ProductFacade productFacade;
 
    // productService constructor injection
 
    @GetMapping(produces={MediaType.APPLICATION_JSON_VALUE} ,value="/all")
    public @ResponseBody List<Category> getCategories() {
        return productFacade.getAllCategories();
    }
    
    @GetMapping("/{categoryId}")
    @ApiOperation(value = "getCategory", nickname = "Get product by Id")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = Product.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
    public @ResponseBody Category getCategory(@PathVariable long categoryId) {
    	return productFacade.getCategory(categoryId);
    }
    
    /**
     * 
     * @param product
     * @return
     */
    @ApiOperation(value = "saveCategory", nickname = "Save category")
    public @ResponseBody Category saveCategory(@RequestBody Category category){
    	return productFacade.save(category);
    }
    
    @GetMapping(value="/search/{searchKey}")
    public @ResponseBody List<Product> findByProductNameContaining(@PathVariable String searchKey){
    
    	return productFacade.findByNameContaining(searchKey, 1, 10);
    }
    
}