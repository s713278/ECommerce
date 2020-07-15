package com.kapps.cart.service;

import java.util.Map;

public interface ItemPriceService {

	public Map<String,Double> getItemPrice(String sku);
	
}
