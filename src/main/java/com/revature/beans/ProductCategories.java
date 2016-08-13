package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="product_categories")
public class ProductCategories {

	@EmbeddedId
	private ProductCategoriesId productCategoriesId;

	public ProductCategories(ProductCategoriesId productCategoriesId) {
		super();
		this.productCategoriesId = productCategoriesId;
	}

	public ProductCategories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductCategoriesId getProductCategoriesId() {
		return productCategoriesId;
	}

	public void setProductCategoriesId(ProductCategoriesId productCategoriesId) {
		this.productCategoriesId = productCategoriesId;
	}
}
