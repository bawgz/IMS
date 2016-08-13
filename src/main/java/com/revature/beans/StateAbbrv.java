package com.revature.beans;

public class StateAbbrv {

	private int abbrevId;
	private String stateName;
	private String stateAbbrev;
	
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
