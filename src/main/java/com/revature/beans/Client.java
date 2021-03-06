package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ims_client")
public class Client {

	@Id
	@Column(name="ims_client_id", nullable = false)
	@SequenceGenerator(name="clientGen",sequenceName="IMS_CLIENT_SEQ")
	@GeneratedValue(generator="clientGen", strategy=GenerationType.AUTO)
	//@NotNull	//might not need for primary key?
	private int imsClientId;
	@Column(name="client_name", nullable = false)
	@NotNull
	private String clientName;
	@Column(name="client_email", nullable = false)
	@NotNull
	private String clientEmail;
	@Column(name="point_of_contact_name", nullable = false)
	@NotNull
	private String pointOfContactName;
	@Column(name="client_phone", nullable = false)
	@NotNull
	private String clientPhone;
	@Column(name="client_fax", nullable = false)
	@NotNull
	private String clientFax;
	
	//mappings
	@OneToOne()
	@JoinColumn(name="address_id", nullable = false, unique = true)
	private Address address;
	@ManyToOne()
	@JoinColumn(name="client_type_id", nullable = false)
	private ClientType clientType;
	
	@OneToMany(mappedBy="client")
	transient private Set<PurchaseOrder> purchaseOrders;
	
	public Client() {
		super();
		this.address = new Address();
		this.clientType = new ClientType();
	}
	
	public Client(String clientName, String clientEmail, String pointOfContactName, String clientPhone, String clientFax) {
		super();
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.pointOfContactName = pointOfContactName;
		this.clientPhone = clientPhone;
		this.clientFax = clientFax;		
	}

	public int getImsClientId() {
		return imsClientId;
	}

	public void setImsClientId(int imsClientId) {
		this.imsClientId = imsClientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getPointOfContactName() {
		return pointOfContactName;
	}

	public void setPointOfContactName(String pointOfContactName) {
		this.pointOfContactName = pointOfContactName;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientFax() {
		return clientFax;
	}

	public void setClientFax(String clientFax) {
		this.clientFax = clientFax;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public Set<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}

	public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}
	
}
