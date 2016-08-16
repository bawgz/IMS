package com.revature.beans;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="ims_product_category")
public class ProductCategory {

	@Id
	@Column(name="category_id", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	@Column(name="category_description", nullable=false)
	private String categoryDescription;
	
	//mappings
	@ManyToMany(mappedBy="productCategories")
	Set<Product> products;
	
	
	public ProductCategory(int categoryId, String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryDescription = categoryDescription;
	}
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
