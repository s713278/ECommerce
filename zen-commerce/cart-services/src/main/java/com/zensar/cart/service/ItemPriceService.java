package com.zensar.cart.service;

import java.util.Map;

public interface ItemPriceService {

	public Map<String,Double> getItemPrice(String sku);
	
}
