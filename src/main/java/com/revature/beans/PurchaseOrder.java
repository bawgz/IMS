package com.revature.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="purchase_order")
public class PurchaseOrder {

	@Id
	@Column(name="order_number")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderNumber;
	@Column(name="subtotal")
	private int subtotal;
	@Column(name="purchase_date")
	private Date purchaseDate;
	@Column(name="tax_amount")
	private int taxAmount;
	@Column(name="po_total")
	private int poTotal;
	
	//mappings
	@ManyToOne()
	@JoinColumn(name="client_id")
	private Client client;
	//TODO create composite key for IMS_PO_LINE
	@OneToMany(mappedBy="purchaseOrder")
	private Set<PoLine> poLines;
	
	public PurchaseOrder(int orderNumber, int subtotal, Date purchaseDate, int taxAmount, int poTotal, Client client) {
		super();
		this.orderNumber = orderNumber;
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.taxAmount = taxAmount;
		this.poTotal = poTotal;
		this.client = client;
		poLines = new HashSet<PoLine>();
	}
	public PurchaseOrder() {
		super();
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}
	public int getPoTotal() {
		return poTotal;
	}
	public void setPoTotal(int poTotal) {
		this.poTotal = poTotal;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Set<PoLine> getPoLines() {
		return poLines;
	}
	public void setPoLines(Set<PoLine> poLines) {
		this.poLines = poLines;
	}
}
