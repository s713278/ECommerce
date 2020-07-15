package com.kapps.cart.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kapps.browse.dao.SkuDao;
import com.kapps.browse.dto.Sku;
import com.kapps.cart.service.ItemPriceService;

/**
 * Default item price implementation
 * @author Mahi
 *
 */
@Service
public class DBItemPriceServiceImpl implements ItemPriceService {

	@Autowired
	private SkuDao skuDao;
	
	
	@Override
	public Map<String, Double> getItemPrice(String skuId) {
		Map<String, Double> result = new ConcurrentHashMap<String, Double>();
		if(skuDao.findById(skuId).isPresent()) {
			Sku sku =skuDao.findById(skuId).get();
			result.put(skuId, sku.getPrice());
		}else {
			result.put(skuId, 90d);
		}
		return result;
	}

}
