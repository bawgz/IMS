package com.revature.beans;

import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ims_product")
public class Product {

	@Id
	@Column(name="product_upc", nullable = false)
	@SequenceGenerator(name="productGen",sequenceName="IMS_PRODUCT_SEQ")
	@GeneratedValue(generator="productGen", strategy=GenerationType.AUTO)
	private int productUpc;
	@NotNull
	@Size(min=1, message="Name is required")
	@Column(name="product_name", nullable = false)
	private String productName;
	@NotNull
	@Size(min=1, message="Description is required")
	@Column(name="product_description", nullable = false)
	private String productDescription;
	@NotNull
	@Size(min=1, max= 5, message="Short name is required")
	@Column(name="short_name", nullable = false)
	private String shortName;
	@NotNull(message="Invalid cost")
	@Min(value=0)
	@Column(name="unit_cost", nullable = false)
	private double unitCost;
	@NotNull
	@Size(min=1, message="Pack size is required")
	@Column(name="pack_size", nullable = false)
	private String packSize;
	@NotNull(message="Invalid quanitity")
	@Min(value=0)
	@Column(name="reorder_quantity", nullable = false)
	private int reorderQuantity;
	@NotNull(message="Invalid threshold")
	@Min(value=0)
	@Column(name="reorder_threshold", nullable = false)
	private int reorderThreshold;
	@NotNull(message="Invalid quanitity")
	@Min(value=0)
	@Column(name="quantity_on_hand", nullable = false)
	private int quantityOnHand;
	@NotNull(message="Invalid price")
	@Min(value=0)
	@Column(name="retail_price", nullable = false)
	private double retailPrice;
	@Column(name="product_weight")
	private double productWeight;
	@Column(name="product_image")
	private Blob productImage;
	
	//mappings
	@ManyToMany
	@JoinTable(name="product_categories",
		joinColumns=@JoinColumn(name="product_upc", nullable = false),
		inverseJoinColumns=@JoinColumn(name="category_id", nullable = false))
	transient private Set<ProductCategory> productCategories;
	
	@NotNull(message="Must select a category")
	transient private String[] categoryNames;
	
	public Product() {
		super();
	}

	//no id, weight, or image
	public Product(String productName, String productDescription, String shortName, double unitCost,
			String packSize, int reorderQuantity, int reorderThreshold, int quantityOnHand, double retailPrice,
			Set<ProductCategory> productCategories) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.shortName = shortName;
		this.unitCost = unitCost;
		this.packSize = packSize;
		this.reorderQuantity = reorderQuantity;
		this.reorderThreshold = reorderThreshold;
		this.quantityOnHand = quantityOnHand;
		this.retailPrice = retailPrice;
		this.productCategories = productCategories;
	}

	//no id or image
	public Product(String productName, String productDescription, String shortName, double unitCost,
			String packSize, int reorderQuantity, int reorderThreshold, int quantityOnHand, double retailPrice,
			double productWeight, Set<ProductCategory> productCategories) {
		super();
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
		this.productCategories = productCategories;
	}

	//no id
	public Product(String productName, String productDescription, String shortName, double unitCost,
			String packSize, int reorderQuantity, int reorderThreshold, int quantityOnHand, double retailPrice,
			double productWeight, Blob productImage, Set<ProductCategory> productCategories) {
		super();
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
		this.productCategories = productCategories;
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

	public double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(double unitCost) {
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

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public double getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}

	public Blob getProductImage() {
		return productImage;
	}

	public void setProductImage(Blob productImage) {
		this.productImage = productImage;
	}

	public Set<ProductCategory> getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(Set<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}

	public String[] getCategoryNames() {
		return categoryNames;
	}

	public void setCategoryNames(String[] categoryNames) {
		this.categoryNames = categoryNames;
	}
}
