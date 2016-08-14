package com.revature.beans;

import javax.persistence.*;

@Embeddable
public class PoLineId {

	@Column(name="order_number", nullable = false)
	private int orderNumber;
	@Column(name="line_number", nullable = false)
	private int lineNumber;
	
	public PoLineId() {
		super();
	}

	public PoLineId(int orderNumber, int lineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.lineNumber = lineNumber;
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
	
}
