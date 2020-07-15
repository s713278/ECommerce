package com.kapps.cart.service;

import com.kapps.cart.vo.CartRequest;
import com.kapps.cart.vo.CartResponse;

public interface CartService {

	public CartResponse addItem(CartRequest request );
	
	public CartResponse removeItem(CartRequest request );
	
	public CartResponse updateItem(CartRequest request );

	public CartResponse getCart(String cartId);
	
	Iterable<CartResponse> findAll();
}
