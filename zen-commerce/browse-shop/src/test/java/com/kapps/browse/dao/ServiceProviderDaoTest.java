package com.kapps.browse.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.kapps.browse.entity.Category;
import com.kapps.browse.entity.Price;
import com.kapps.browse.entity.Product;
import com.kapps.browse.entity.ServiceArea;
import com.kapps.browse.entity.ServiceProvider;
import com.kapps.browse.entity.Sku;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ServiceProviderDaoTest {

	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private ServiceProviderDao serviceProviderDao;
	
	@Test
	public void testSave(){
		ServiceProvider serviceProvider = createProduct();
		ServiceProvider  savedProduct = testEntityManager.persist(serviceProvider);
		ServiceProvider  actualProductFromDB = serviceProviderDao.findById(savedProduct.getId()).get();
		Assert.assertEquals(savedProduct, actualProductFromDB);
	}
	
	private ServiceProvider createProduct(){
		ServiceProvider serviceProvider = new ServiceProvider();
		serviceProvider.setName("Sri Sai Dry-Fruits Store");
		
		List<Category>  categories = new ArrayList<Category>();
		Category category1 =new Category();
		category1.setName("Dry Fruits , Nuts & Seeds");
		
		Product product1 = new Product();
		product1.setName("Almonds");
		List<Product> products=new ArrayList<>();
		
		
		List<Sku> skus=new ArrayList<>();
		Sku sku1=new Sku();
		sku1.setName("Salted Almonds - 250 grms");
		skus.add(sku1);
		
		Price price=new Price();
		price.setListPrice(500f);
		price.setSalePrice(450f);
		price.setSkuId(sku1);
		price.setServiceProvider(serviceProvider);
		
		
		
		List<ServiceArea> areas = new ArrayList<>();
		ServiceArea area = new ServiceArea();
		area.setAreaName("Mayurinagar");
		area.setActive(true);
		ServiceArea area1 = new ServiceArea();
		area1.setAreaName("Venkataraya nagar");
		area1.setActive(true);
		areas.add(area1);
		areas.add(area);
		
		product1.setSkus(skus);
		products.add(product1);
		
		category1.setProducts(products);
		categories.add(category1);
		
		serviceProvider.setServiceAreas(areas);
		serviceProvider.setCategories(categories);
		return serviceProvider;
	}
	
}
