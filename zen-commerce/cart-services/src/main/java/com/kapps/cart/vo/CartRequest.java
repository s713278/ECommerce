package com.kapps.cart.vo;


public class CartRequest {

	private String cartId;
	
	private String channel;
	
	private String productId;
	
	private String skuId;
	
	private int quanity;

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}

	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	/**
	 * @return the quanity
	 */
	public int getQuanity() {
		return quanity;
	}

	/**
	 * @param quanity the quanity to set
	 */
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public CartRequest() {
		super();
		// TODO Auto-generated constructor stub
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CartRequest [cartId=" + cartId + ", channel=" + channel + ", productId=" + productId + ", skuId="
				+ skuId + ", quanity=" + quanity + "]";
	}

	
}
