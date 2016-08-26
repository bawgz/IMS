package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ims_state_abbrv")
public class StateAbbrv {

	@Id
	@SequenceGenerator(name="stateAbbrvGen",sequenceName="IMS_SA_SEQ")
	@GeneratedValue(generator="stateAbbrvGen", strategy=GenerationType.AUTO)
	@Column(name="abbrv_id", nullable = false)
	private int abbrvId;
	@Column(name="state_name", nullable = false)
	private String stateName;
	@Column(name="state_abbrv", nullable = false)
	private String stateAbbrv;
	
	//mappings
	@OneToMany(mappedBy="stateAbbrv", cascade=CascadeType.ALL)
	transient private Set<Address> addresses;
	
	public StateAbbrv() {
		super();
	}

	public StateAbbrv(String stateName, String stateAbbrv) {
		super();
		this.stateName = stateName;
		this.stateAbbrv = stateAbbrv;
	}
	
	public StateAbbrv(int abbrvId, String stateName, String stateAbbrv) {
		super();
		this.abbrvId = abbrvId;
		this.stateName = stateName;
		this.stateAbbrv = stateAbbrv;
	}

	public int getAbbrvId() {
		return abbrvId;
	}

	public void setAbbrvId(int abbrvId) {
		this.abbrvId = abbrvId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateAbbrv() {
		return stateAbbrv;
	}

	public void setStateAbbrv(String stateAbbrv) {
		this.stateAbbrv = stateAbbrv;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return stateAbbrv;
	}
	
	
}
