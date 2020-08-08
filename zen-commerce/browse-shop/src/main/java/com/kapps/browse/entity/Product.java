package com.kapps.browse.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PRODUCT")
@NamedQuery(name = "Product.fetchByNameContains",
query = "SELECT e FROM Product e WHERE e.name =:name "
)
public class Product {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
   @NotNull(message = "Product name is required.")
    @Basic(optional = false)
    private String name;
 
    private String imageURL;

	@Temporal(TemporalType.DATE)
	private java.util.Date createdDate;
    
    @OneToMany(
            cascade = CascadeType.ALL, 
            orphanRemoval = true
        )
    private List<Sku> skus = new ArrayList<Sku>();

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

	public List<Sku> getSkus() {
		return skus;
	}

	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}
 
	
    // all arguments contructor 
    // standard getters and setters
    
}