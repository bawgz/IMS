package com.revature.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.revature.beans.Address;
import com.revature.beans.Client;
import com.revature.beans.ClientType;
import com.revature.beans.PoLine;
import com.revature.beans.PoLineId;
import com.revature.beans.Product;
import com.revature.beans.ProductCategory;
import com.revature.beans.PurchaseOrder;
import com.revature.beans.StateAbbrv;

public class App {

	public static void main(String[] args) {
		
		DataLayer dataLayer = new DataLayer();
		//dataLayer.insert(whatever);
		ClientType clientType1 = new ClientType("Supplier");
		ClientType clientType2 = new ClientType("Retailer");
		dataLayer.insert(clientType1);
		dataLayer.insert(clientType2);
	}

}
