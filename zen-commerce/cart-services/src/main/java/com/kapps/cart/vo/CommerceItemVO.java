package com.kapps.cart.vo;

import java.io.Serializable;

public class CommerceItemVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3216356352459378347L;

	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	private String skuId;
	
	private String productId;
	
	private Double unitPrice;
	
	private Integer quanity;
	
	private Double amount;
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public CommerceItemVO() {
		super();
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
	 * @return the unitPrice
	 */
	public Double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the quanity
	 */
	public Integer getQuanity() {
		return quanity;
	}

	/**
	 * @param quanity the quanity to set
	 */
	public void setQuanity(Integer quanity) {
		this.quanity = quanity;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}
