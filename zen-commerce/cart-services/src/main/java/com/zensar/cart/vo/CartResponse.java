package com.zensar.cart.vo;


import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("CartResponse")
public class CartResponse {

	@Id
	private String cartId;
	
	private Boolean success;
	
	private ShoppingCartVO shoppingCartVO;

	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * @return the shoppingCartVO
	 */
	public ShoppingCartVO getShoppingCartVO() {
		return shoppingCartVO;
	}

	/**
	 * @param shoppingCartVO the shoppingCartVO to set
	 */
	public void setShoppingCartVO(ShoppingCartVO shoppingCartVO) {
		this.shoppingCartVO = shoppingCartVO;
	}

	public CartResponse() {
		super();
	}

	/**
	 * @return the cartId
	 */
	public String getCartId() {
		return cartId;
	}

	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	
	
}
