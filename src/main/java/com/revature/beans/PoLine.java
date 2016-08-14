package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="ims_po_line")
public class PoLine {

	@EmbeddedId
	private PoLineId poLineId;
	
	@Column(name="unit_price", nullable = false)
	private int unitPrice;
	@Column(name="quantity_ordered", nullable = false)
	private int quantityOrdered;
	@Column(name="product_upc", nullable = false)
	private int productUpc;
	
	//mappings
	@ManyToOne()
	private PurchaseOrder purchaseOrder;
	@ManyToOne()
	private Product product;
	
	public PoLine() {
		super();
	}

	public PoLine(PoLineId poLineId, int unitPrice, int quantityOrdered, int productUpc, PurchaseOrder purchaseOrder,
			Product product) {
		super();
		this.poLineId = poLineId;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.productUpc = productUpc;
		this.purchaseOrder = purchaseOrder;
		this.product = product;
	}

	public PoLineId getPoLineId() {
		return poLineId;
	}

	public void setPoLineId(PoLineId poLineId) {
		this.poLineId = poLineId;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public int getProductUpc() {
		return productUpc;
	}

	public void setProductUpc(int productUpc) {
		this.productUpc = productUpc;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
