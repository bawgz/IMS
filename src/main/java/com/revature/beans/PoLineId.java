package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Embeddable
public class PoLineId implements Serializable {
	
	@JoinColumn(name="order_number", nullable = false)
	private Integer orderNumber;
	@Column(name="line_number", nullable = false)
	private Integer lineNumber;
	
	public PoLineId() {
		super();
	}

	public PoLineId(Integer orderNumber, Integer lineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.lineNumber = lineNumber;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}
	
}
