package com.kapps.browse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kapps.browse.dto.Product;
import com.kapps.browse.facade.ProductFacade;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductFacade productFacade;
 
    // productService constructor injection
 
    @GetMapping(produces={MediaType.APPLICATION_JSON_VALUE} ,value="/all")
    public @ResponseBody List<Product> getProducts() {
        return productFacade.getAllProducts();
    }
    
    @GetMapping(produces={MediaType.APPLICATION_JSON_VALUE},value="/{productId}")
    @ApiOperation(value = "getProduct", nickname = "Get product by Id")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = Product.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
    public @ResponseBody Product getProduct(@PathVariable long productId) {
    	return productFacade.getProduct(productId);
    }
    
    /**
     * 
     * @param product
     * @return
     */
    @ApiOperation(value = "saveProduct", nickname = "Save product")
    public @ResponseBody Product saveProduct(@RequestBody Product product){
    	return productFacade.save(product);
    }
}