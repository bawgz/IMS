package com.revature.beans;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="client_type")
public class ClientType {

	@Id
	@Column(name="client_type_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int clientTypeId;
	@Column(name="client_type")
	private String clientType;
	@OneToMany(mappedBy="clientType")
	private Set<Client> clients;
	
	public ClientType(int clientTypeId, String clientType) {
		super();
		this.clientTypeId = clientTypeId;
		this.clientType = clientType;
	}
	public ClientType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClientTypeId() {
		return clientTypeId;
	}
	public void setClientTypeId(int clientTypeId) {
		this.clientTypeId = clientTypeId;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public Set<Client> getClients() {
		return clients;
	}
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
}
