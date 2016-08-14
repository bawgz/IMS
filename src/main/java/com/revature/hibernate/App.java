package com.revature.hibernate;

import com.revature.beans.StateAbbrv;

public class App {

	public static void main(String[] args) {
		StateAbbrv stateAbbrv = new StateAbbrv(0, "Alabama", "AB");
		DataLayer dataLayer = new DataLayer();
		dataLayer.insertStateAbbrv(stateAbbrv);
		System.out.println("added");

	}

}
