package com.zensar.cart;

public interface CartService {

	public void addItem(String productId,String skuId,int quanity);
	
	public void removeItem();
	
	public void updateItem();
}
