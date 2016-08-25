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
		String[] stateArr = new String[] {"Alabama", "Arkansas", "Arizona", "Alaska", "California", "Colorado", 
				"Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", 
				"Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", 
				"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", 
				"New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", 
				"South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", 
				"West Virginia", "Wisconsin", "Wyoming" };
		String[] abbreviations = new String[]{"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA",
				"KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND", "OH","OK",
				"OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		for(int i=0; i<stateArr.length; i++){
			StateAbbrv sa = new StateAbbrv(i,stateArr[i],abbreviations[i]);
			dataLayer.insert(sa);
		}
		
		ProductCategory p1 = new ProductCategory("Automobile");
		ProductCategory p2 = new ProductCategory("Air Ship");
		ProductCategory p3 = new ProductCategory("Sports");
		ProductCategory p4 = new ProductCategory("Utility");
		ProductCategory p5 = new ProductCategory("Luxurious");
		ProductCategory p6 = new ProductCategory("Heavy Duty");
		ProductCategory p7 = new ProductCategory("Armored");
		dataLayer.insert(p1);
		dataLayer.insert(p2);
		dataLayer.insert(p3);
		dataLayer.insert(p4);
		dataLayer.insert(p5);
		dataLayer.insert(p6);
		dataLayer.insert(p7);
		
		ClientType clientType1 = new ClientType("Supplier");
		ClientType clientType2 = new ClientType("Retailer");
		dataLayer.insert(clientType1);
		dataLayer.insert(clientType2);
		
//		Set<ProductCategory> cats = new HashSet<ProductCategory>();
//		cats.add(p1);
//		cats.add(p3);
//		Product product = new Product("IDK","Hello","IDK",10,"OK",10,10,10,10,10,cats);
//		dataLayer.insert(product);
	}

}
