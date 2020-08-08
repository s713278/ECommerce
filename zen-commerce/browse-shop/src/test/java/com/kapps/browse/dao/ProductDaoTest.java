package com.kapps.browse.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.kapps.browse.dao.ProductDao;
import com.kapps.browse.entity.Product;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductDaoTest {

	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private ProductDao productDao;
	
	@Test
	public void testSave(){
		Product product= createProduct();
		Product  savedProduct = testEntityManager.persist(product);
		Product  actualProductFromDB = productDao.findById(savedProduct.getId()).get();
		Assert.assertEquals(savedProduct, actualProductFromDB);
	}
	
	private Product createProduct(){
		Product product = new Product();
		product.setName("Note Book");
		product.setImageURL("http://google.com");
		return product;
	}
}
