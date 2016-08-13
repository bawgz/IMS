package com.revature.beans;

import java.sql.Blob;

public class Product {

	private int productUpc;
	private String productName;
	private String productDescription;
	private String shortName;
	private int unitCost;
	private String packSize;
	private int reorderQuantity;
	private int reorderThreshold;
	private int quantityOnHand;
	private int retailPrice;
	private int productWeight;
	private Blob productImage;
	
	public Product() {
		super();
	}

	public Product(int productUpc, String productName, String productDescription, String shortName, int unitCost,
			String packSize, int reorderQuantity, int reorderThreshold, int quantityOnHand, int retailPrice,
			int productWeight, Blob productImage) {
		super();
		this.productUpc = productUpc;
		this.productName = productName;
		this.productDescription = productDescription;
		this.shortName = shortName;
		this.unitCost = unitCost;
		this.packSize = packSize;
		this.reorderQuantity = reorderQuantity;
		this.reorderThreshold = reorderThreshold;
		this.quantityOnHand = quantityOnHand;
		this.retailPrice = retailPrice;
		this.productWeight = productWeight;
		this.productImage = productImage;
	}

	public int getProductUpc() {
		return productUpc;
	}

	public void setProductUpc(int productUpc) {
		this.productUpc = productUpc;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}

	public String getPackSize() {
		return packSize;
	}

	public void setPackSize(String packSize) {
		this.packSize = packSize;
	}

	public int getReorderQuantity() {
		return reorderQuantity;
	}

	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}

	public int getReorderThreshold() {
		return reorderThreshold;
	}

	public void setReorderThreshold(int reorderThreshold) {
		this.reorderThreshold = reorderThreshold;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}

	public Blob getProductImage() {
		return productImage;
	}

	public void setProductImage(Blob productImage) {
		this.productImage = productImage;
	}
	
}
