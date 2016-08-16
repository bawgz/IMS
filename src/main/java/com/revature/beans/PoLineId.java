package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PoLineId implements Serializable {
	@ManyToOne()
	@JoinColumn(name="order_number", nullable = false)
	private PurchaseOrder purchaseOrder;
	@Column(name="line_number", nullable = false)
	private int lineNumber;
	
	public PoLineId() {
		super();
	}

	public PoLineId(PurchaseOrder purchaseOrder, int lineNumber) {
		super();
		this.purchaseOrder = purchaseOrder;
		this.lineNumber = lineNumber;
	}

	public PurchaseOrder getOrderNumber() {
		return purchaseOrder;
	}

	public void setOrderNumber(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
}
