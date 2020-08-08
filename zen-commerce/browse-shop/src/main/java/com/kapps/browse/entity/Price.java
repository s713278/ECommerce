package com.kapps.browse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRICE")
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Float wholeSalePrice;

	private Float listPrice;
	
	private Float salePrice;

	private Float commision;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the wholeSalePrice
	 */
	public Float getWholeSalePrice() {
		return wholeSalePrice;
	}

	/**
	 * @param wholeSalePrice the wholeSalePrice to set
	 */
	public void setWholeSalePrice(Float wholeSalePrice) {
		this.wholeSalePrice = wholeSalePrice;
	}

	/**
	 * @return the listPrice
	 */
	public Float getListPrice() {
		return listPrice;
	}

	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(Float listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * @return the salePrice
	 */
	public Float getSalePrice() {
		return salePrice;
	}

	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(Float salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * @return the commision
	 */
	public Float getCommision() {
		return commision;
	}

	/**
	 * @param commision the commision to set
	 */
	public void setCommision(Float commision) {
		this.commision = commision;
	}

	@OneToOne
	private Sku skuId;
	
	@OneToOne
	private ServiceProvider serviceProvider;

	/**
	 * @return the skuId
	 */
	public Sku getSkuId() {
		return skuId;
	}

	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(Sku skuId) {
		this.skuId = skuId;
	}

	/**
	 * @return the serviceProvider
	 */
	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * @param serviceProvider the serviceProvider to set
	 */
	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
	
}