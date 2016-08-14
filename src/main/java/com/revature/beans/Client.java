//package com.revature.beans;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="ims_client")
//public class Client {
//
//	@Id
//	@Column(name="ims_client_id")
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int imsClientId;
//	@Column(name="client_name")
//	private String clientName;
//	@Column(name="client_email")
//	private String clientEmail;
//	@Column(name="point_of_contact_name")
//	private String pointOfContactName;
//	@Column(name="client_phone")
//	private String clientPhone;
//	@Column(name="client_fax")
//	private String clientFax;
//	
//	//mappings
//	@OneToOne()
//	@JoinColumn(name="address_id")
//	private Address address;
//	@ManyToOne()
//	@JoinColumn(name="client_type_id")
//	private ClientType clientType;
//	@OneToMany(mappedBy="client")
//	private Set<PurchaseOrder> purchaseOrders;
//	public Client(int imsClientId, String clientName, String clinetEmail, String pointOfContactName, String clientPhone,
//			String clientFax, Address address, ClientType clientType) {
//		super();
//		this.imsClientId = imsClientId;
//		this.clientName = clientName;
//		this.clientEmail = clinetEmail;
//		this.pointOfContactName = pointOfContactName;
//		this.clientPhone = clientPhone;
//		this.clientFax = clientFax;
//		this.address = address;
//		this.clientType = clientType;
//		purchaseOrders = new HashSet<PurchaseOrder>();
//	}
//	public Client() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public int getImsClientId() {
//		return imsClientId;
//	}
//	public void setImsClientId(int imsClientId) {
//		this.imsClientId = imsClientId;
//	}
//	public String getClientName() {
//		return clientName;
//	}
//	public void setClientName(String clientName) {
//		this.clientName = clientName;
//	}
//	public String getClinetEmail() {
//		return clientEmail;
//	}
//	public void setClinetEmail(String clinetEmail) {
//		this.clientEmail = clinetEmail;
//	}
//	public String getPointOfContactName() {
//		return pointOfContactName;
//	}
//	public void setPointOfContactName(String pointOfContactName) {
//		this.pointOfContactName = pointOfContactName;
//	}
//	public String getClientPhone() {
//		return clientPhone;
//	}
//	public void setClientPhone(String clientPhone) {
//		this.clientPhone = clientPhone;
//	}
//	public String getClientFax() {
//		return clientFax;
//	}
//	public void setClientFax(String clientFax) {
//		this.clientFax = clientFax;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddressId(Address address) {
//		this.address = address;
//	}
//	public ClientType getClientTypeId() {
//		return clientType;
//	}
//	public void setClientTypeId(ClientType clientType) {
//		this.clientType = clientType;
//	}
//}
