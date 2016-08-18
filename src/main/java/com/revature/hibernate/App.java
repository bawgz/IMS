package com.revature.hibernate;

import java.util.Date;

import com.revature.beans.Address;
import com.revature.beans.Client;
import com.revature.beans.ClientType;
import com.revature.beans.PoLine;
import com.revature.beans.PoLineId;
import com.revature.beans.Product;
import com.revature.beans.PurchaseOrder;
import com.revature.beans.StateAbbrv;

public class App {

	public static void main(String[] args) {
		
		DataLayer dataLayer = new DataLayer();
		
//		String[] stateArr = new String[] {"Alabama", "Arkansas", "Arizona", "Alaska", "California", "Colorado", 
//				"Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", 
//				"Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", 
//				"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", 
//				"New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", 
//				"South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", 
//				"West Virginia", "Wisconsin", "Wyoming" };
//		String[] abbreviations = new String[]{"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA",
//				"KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND", "OH","OK",
//				"OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
//		for(int i=0; i<stateArr.length; i++){
//			StateAbbrv sa = new StateAbbrv(i,stateArr[i],abbreviations[i]);
//			dataLayer.insert(sa);
//		}

//		StateAbbrv sa = new StateAbbrv(6,"Alabama","AL");
//		Address a = new Address(1,"Hello","World","Yes",sa,"60510");
//		dataLayer.insert(a);

		Product product = new Product(0, "jk", "bhj", "bvhjk", 0, "ghm", 0, 0, 1, 1);
		dataLayer.insert(product);
	}

}
