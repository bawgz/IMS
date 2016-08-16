package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="ims_po_line")
public class PoLine {

	@Column(name="unit_price", nullable = false)
	private int unitPrice;
	@Column(name="quantity_ordered", nullable = false)
	private int quantityOrdered;
	
	//mappings
	@EmbeddedId
	private PoLineId poLineId;
	
	@ManyToOne()
	@MapsId("orderNumber")
	private PurchaseOrder purchaseOrder;
	
	@ManyToOne
	@JoinColumn(name="product_upc", nullable = false)
	private Product product;
	
	public PoLine() {
		super();
	}

	public PoLine(PoLineId poLineId, int unitPrice, int quantityOrdered, Product product) {
		super();
		this.poLineId = poLineId;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
//		this.productUpc = productUpc;
//		this.purchaseOrder = purchaseOrder;
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


	public PurchaseOrder getPurchaseOrder() {
		return poLineId.getOrderNumber();
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		poLineId.setOrderNumber(purchaseOrder);
	}

	public int getLineNumber(){
		return poLineId.getLineNumber();
	}
	
	public void setLineNumber(int ln){
		poLineId.setLineNumber(ln);
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
