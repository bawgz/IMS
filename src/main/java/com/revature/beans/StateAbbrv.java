package com.revature.beans;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="ims_state_abbrv")
public class StateAbbrv {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="abbrv_id", nullable = false)
	private int abbrevId;
	@Column(name="state_name", nullable = false)
	private String stateName;
	@Column(name="state_abbrv", nullable = false)
	private String stateAbbrev;
	
	//mappings
	@OneToMany(mappedBy="stateAbbrv")
	private Set<Address> addresses;
	
	public StateAbbrv() {
		super();
	}

	public StateAbbrv(int abbrevId, String stateName, String stateAbbrev) {
		super();
		this.abbrevId = abbrevId;
		this.stateName = stateName;
		this.stateAbbrev = stateAbbrev;
	}

	public int getAbbrevId() {
		return abbrevId;
	}

	public void setAbbrevId(int abbrevId) {
		this.abbrevId = abbrevId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateAbbrev() {
		return stateAbbrev;
	}

	public void setStateAbbrev(String stateAbbrev) {
		this.stateAbbrev = stateAbbrev;
	}
	
}
