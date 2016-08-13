package com.revature.beans;

public class ProductCategories {

	private int productUpc;
	private int categoryId;
	public ProductCategories(int productUpc, int categoryId) {
		super();
		this.productUpc = productUpc;
		this.categoryId = categoryId;
	}
	public ProductCategories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductUpc() {
		return productUpc;
	}
	public void setProductUpc(int productUpc) {
		this.productUpc = productUpc;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
}
