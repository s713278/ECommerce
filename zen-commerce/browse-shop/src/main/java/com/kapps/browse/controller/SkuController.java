package com.kapps.browse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kapps.browse.entity.Product;
import com.kapps.browse.entity.Sku;
import com.kapps.browse.facade.ProductFacade;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/sku")
public class SkuController {
	
	@Autowired
	private ProductFacade productFacade;
 
      
    @GetMapping("/{skuId}")
    @ApiOperation(value = "getSku", nickname = "Get SKU by Id")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = Product.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
    public @ResponseBody Sku getSKu(@PathVariable String skuId) {
    	return productFacade.getSku(skuId);
    }
}