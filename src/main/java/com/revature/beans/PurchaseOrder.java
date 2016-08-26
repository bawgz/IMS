package com.revature.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="ims_purchase_order")
public class PurchaseOrder {

	@Id
	@Column(name="order_number", nullable = false)
	@SequenceGenerator(name="purchaseOrderGen",sequenceName="IMS_PO_SEQ")
	@GeneratedValue(generator="purchaseOrderGen", strategy=GenerationType.AUTO)
	private int orderNumber;
	@Column(name="subtotal", nullable = false)
	private double subtotal;
	@Column(name="purchase_date", nullable = false)
	private Date purchaseDate;
	@Column(name="tax_amount", nullable = false)
	private double taxAmount;
	@Column(name="po_total", nullable = false)
	private double poTotal;
	
	//mappings
	@ManyToOne()
	@JoinColumn(name="client_id", nullable = false)
	private Client client;
	@OneToMany(mappedBy="poLineId.orderNumber")
	transient private Set<PoLine> poLines;
	
	public PurchaseOrder() {
		super();
		client = new Client();
		poLines = new HashSet<PoLine>();
	}

	public PurchaseOrder(double subtotal, Date purchaseDate, double taxAmount, double poTotal, Client client) {
		super();
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.taxAmount = taxAmount;
		this.poTotal = poTotal;
		this.client = client;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getPoTotal() {
		return poTotal;
	}

	public void setPoTotal(double poTotal) {
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
