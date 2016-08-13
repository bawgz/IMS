package com.revature.beans;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ProductCategoriesId implements Serializable{

	@ManyToOne()
	@JoinColumn(name="product_upc")
	private Product product;
	@ManyToOne()
	@JoinColumn(name="category_id")
	private ProductCategory productCategory;
	public ProductCategoriesId(Product product, ProductCategory productCategory) {
		super();
		this.product = product;
		this.productCategory = productCategory;
	}
	public ProductCategoriesId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
}
