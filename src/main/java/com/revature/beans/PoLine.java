package com.revature.beans;

public class PoLine {

	private int orderNumber;
	private int lineNumber;
	private int unitPrice;
	private int quantityOrdered;
	private int productUpc;
	
	public PoLine() {
		super();
	}

	public PoLine(int orderNumber, int lineNumber, int unitPrice, int quantityOrdered, int productUpc) {
		super();
		this.orderNumber = orderNumber;
		this.lineNumber = lineNumber;
		this.unitPrice = unitPrice;
		this.quantityOrdered = quantityOrdered;
		this.productUpc = productUpc;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
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
	
}
