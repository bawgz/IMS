package com.revature.hibernate;

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
	}

}
