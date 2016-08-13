package com.revature.beans;

public class ProductCategory {

	private int categoryId;
	private String categoryDescription;
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
}
