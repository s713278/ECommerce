package com.kapps.browse.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CATEGORY")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Category name is required.")
	@Basic(optional = false)
	@Column(name = "NAME")
	private String name;

	@Column(name = "IMAGE_URL")
	private String imageURL;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Product> products = new ArrayList<Product>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Category> subCategories = new ArrayList<Category>();


	@Temporal(TemporalType.DATE)
	private java.util.Date createdDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	// all arguments contructor
	// standard getters and setters

}