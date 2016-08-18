package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="ims_po_line")
public class PoLine {
	
	//mappings
	@EmbeddedId
	private PoLineId poLineId;

	@Column(name="unit_price", nullable = false)
	private double unitPrice;
	@Column(name="quantity_ordered", nullable = false)
	private int quantityOrdered;
	
	@ManyToOne
	@JoinColumn(name="product_upc", nullable = false)
	private Product product;
	
	public PoLine() {
		super();
	}

	public PoLine(double unitPrice, int quantityOrdered, Product product) {
		super();
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
	}

	public PoLineId getPoLineId() {
		return poLineId;
	}

	public void setPoLineId(PoLineId poLineId) {
		this.poLineId = poLineId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
