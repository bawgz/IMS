package com.revature.hibernate;

import java.util.HashSet;
import java.util.Set;

import com.revature.beans.Address;
import com.revature.beans.StateAbbrv;

public class App {

	public static void main(String[] args) {
		DataLayer dataLayer = new DataLayer();

		
//		StateAbbrv stateAbbrv = new StateAbbrv(0, "Alabama", "AB");
//		dataLayer.insert(stateAbbrv);
//		System.out.println("state_abbrv added");
		
		Address address = new Address(0, "732 Farmhouse Road", null, "Mickleton", 9, "08056");
		dataLayer.insert(address);
		System.out.println("address added");

//		StateAbbrv stateAbbrv = new StateAbbrv(2, "Alaska", "AK");
//		Address address = new Address(1, "Hello", "Please", "Work", 0, "55555");
//		Set<Address> addresses = new HashSet<Address>();
//		addresses.add(address);
//		dataLayer.insertObject(stateAbbrv);
//		System.out.println("added State Abbreviation");
//		dataLayer.insertObject(address);
//		System.out.println("added Address");

	}

}
