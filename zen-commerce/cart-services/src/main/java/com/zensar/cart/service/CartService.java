package com.zensar.cart.service;

import com.zensar.cart.dto.CartRequest;
import com.zensar.cart.dto.CartResponse;

public interface CartService {

	public CartResponse addItem(CartRequest request );
	
	public CartResponse removeItem(CartRequest request );
	
	public CartResponse updateItem(CartRequest request );
}
