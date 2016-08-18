package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Embeddable
public class PoLineId implements Serializable {
	
	@ManyToOne
	@JoinColumn(name="order_number", nullable = false)
	private PurchaseOrder orderNumber;
	@Column(name="line_number", nullable = false)
	private Integer lineNumber;
	
	public PoLineId() {
		super();
	}

	public PoLineId(PurchaseOrder orderNumber, Integer lineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.lineNumber = lineNumber;
	}

	public PurchaseOrder getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(PurchaseOrder orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}
	
}
