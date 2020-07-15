package com.kapps.cart.vo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartVO {

	private List<CommerceItemVO> commerceItems;

	public ShoppingCartVO() {
		super();
		commerceItems = new ArrayList<CommerceItemVO>();
	}

	/**
	 * @return the commerceItems
	 */
	public List<CommerceItemVO> getCommerceItems() {
		return commerceItems;
	}

	/**
	 * @param commerceItems the commerceItems to set
	 */
	public void setCommerceItems(List<CommerceItemVO> commerceItems) {
		this.commerceItems = commerceItems;
	}
	
	
}
