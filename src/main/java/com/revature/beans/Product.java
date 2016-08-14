package com.revature.beans;

import java.sql.Blob;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="ims_product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_upc", nullable = false)
	private int productUpc;
	@Column(name="product_name", nullable = false)
	private String productName;
	@Column(name="product_description", nullable = false)
	private String productDescription;
	@Column(name="short_name", nullable = false)
	private String shortName;
	@Column(name="unit_cost", nullable = false)
	private int unitCost;
	@Column(name="pack_size", nullable = false)
	private String packSize;
	@Column(name="reorder_quantity", nullable = false)
	private int reorderQuantity;
	@Column(name="reorder_threshold", nullable = false)
	private int reorderThreshold;
	@Column(name="quantity_on_hand", nullable = false)
	private int quantityOnHand;
	@Column(name="retail_price", nullable = false)
	private int retailPrice;
	@Column(name="product_weight")
	private int productWeight;
	@Column(name="product_image")
	private Blob productImage;
	
	//mappings
	@OneToMany(mappedBy="product")
	Set<ProductCategoriesId> productCategories;
	
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
