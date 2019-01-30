package com.zensar.browse.dao;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.zensar.BnSApplication;
import com.zensar.browse.dto.Product;


@SpringBootTest(classes=BnSApplication.class)
public class ProductDaoTestWithTestNG extends AbstractTestNGSpringContextTests {

	
	@Autowired
	private ProductDao productDao;
	
	@Test
	public void testSave(){
		Product product= createProduct();
		Product  savedProduct = productDao.save(product);
		Product  actualProductFromDB = productDao.findById(savedProduct.getId()).get();
		Assert.assertEquals(savedProduct.getName(), actualProductFromDB.getName());
	}
	
	private Product createProduct(){
		Product product = new Product();
		product.setName("Note Book");
		product.setImageURL("http://google.com");
		return product;
	}}
