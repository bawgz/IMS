package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ims_product_category")
public class ProductCategory {

	@Id
	@Column(name="category_id", nullable=false)
	@SequenceGenerator(name="productCategoryGen",sequenceName="IMS_PC_SEQ")
	@GeneratedValue(generator="productCategoryGen", strategy=GenerationType.AUTO)
	private int categoryId;
	@Column(name="category_description", nullable=false)
	private String categoryDescription;
	
	//mappings
	@ManyToMany(mappedBy="productCategories")
	Set<Product> products;
	
	public ProductCategory() {
		super();
	}
	
	public ProductCategory(String categoryDescription) {
		super();
		this.categoryDescription = categoryDescription;
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
