package com.revature.hibernate;

import java.util.HashSet;
import java.util.Set;

import com.revature.beans.Address;
import com.revature.beans.StateAbbrv;

public class App {

	public static void main(String[] args) {
		DataLayer dataLayer = new DataLayer();
		StateAbbrv stateAbbrv = new StateAbbrv(2, "Alaska", "AK");
		Address address = new Address(1, "Hello", "Please", "Work", stateAbbrv, "55555");
		Set<Address> addresses = new HashSet<Address>();
		addresses.add(address);
		dataLayer.insertObject(stateAbbrv);
		System.out.println("added State Abbreviation");
		dataLayer.insertObject(address);
		System.out.println("added Address");
	}

}
