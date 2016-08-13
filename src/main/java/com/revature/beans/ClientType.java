package com.revature.beans;

public class ClientType {

	private int clientTypeId;
	private String clientType;
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
}
