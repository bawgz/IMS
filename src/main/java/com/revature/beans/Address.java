package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="ims_address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ims_address_id", nullable = false)
	private int imsAddressId;
	@Column(name="street_address_1", nullable = false)
	private String streetAddress1;
	@Column(name="street_address_2")
	private String streetAddress2;
	@Column(name="address_city", nullable = false)
	private String addressCity;
	@JoinColumn(name="state_id", nullable = false)
	private int stateId;
	@Column(name="address_zip", nullable = false)
	private String addressZip;
	
	//mappings
	@ManyToOne()
	private StateAbbrv stateAbbrv;
	
	public Address() {
		super();
	}

	public Address(int imsAddressId, String streetAddress1, String streetAddress2, String addressCity, int stateId,
			String addressZip) {
		super();
		this.imsAddressId = imsAddressId;
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.addressCity = addressCity;
		this.stateId = stateId;
		this.addressZip = addressZip;
	}

	public int getImsAddressId() {
		return imsAddressId;
	}

	public void setImsAddressId(int imsAddressId) {
		this.imsAddressId = imsAddressId;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getAddressZip() {
		return addressZip;
	}

	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}

	public StateAbbrv getStateAbbrv() {
		return stateAbbrv;
	}

	public void setStateAbbrv(StateAbbrv stateAbbrv) {
		this.stateAbbrv = stateAbbrv;
	}
	
}
