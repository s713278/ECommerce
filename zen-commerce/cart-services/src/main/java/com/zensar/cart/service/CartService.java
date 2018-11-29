package com.zensar.cart.service;

import com.zensar.cart.dto.CartRequest;

public interface CartService {

	public void addItem(CartRequest request );
	
	public void removeItem(CartRequest request );
	
	public void updateItem(CartRequest request );
}
