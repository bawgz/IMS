package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ims_client_type")
public class ClientType {

	@Id
	@Column(name="client_type_id", nullable = false)
	@SequenceGenerator(name="clientTypeGen",sequenceName="IMS_CT_SEQ")
	@GeneratedValue(generator="clientTypeGen", strategy=GenerationType.AUTO)
	private int clientTypeId;
	@Column(name="client_type", nullable = false)
	private String clientType;
	@OneToMany(mappedBy="clientType")
	private Set<Client> clients;
	
	public ClientType() {
		super();
	}
	
	public ClientType(String clientType) {
		super();
		this.clientType = clientType;
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
