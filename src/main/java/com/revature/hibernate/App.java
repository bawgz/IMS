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

		DataLayer dataLayer = new DataLayer();

		for(int i=0; i<stateArr.length; i++){
			StateAbbrv sa = new StateAbbrv(i,stateArr[i],abbreviations[i]);
			dataLayer.insert(sa);
		}
		StateAbbrv sa = new StateAbbrv(1,"Alabama","AL");
		Address a = new Address(1,"Hello","World","Yes",sa,"60510");
		dataLayer.insert(a);
		
//		DataLayer dataLayer = new DataLayer();
//		StateAbbrv sa = new StateAbbrv(1,"Alabama","AL");
//		Address a = new Address(1,"Hello","World","Yes",sa,"60510");
//		ClientType ct = new ClientType(1,"Supplier");
//		dataLayer.insert(ct);
//		Client client = new Client(1, "Luke", "luke@ok", "Nick", "8675309", "yeah", a, ct);
//		dataLayer.insert(client);
//		PurchaseOrder po = new PurchaseOrder(1, 100, new Date(), 10, 110, client);
//		dataLayer.insert(po);
//		PoLineId poLineId = new PoLineId();
//		dataLayer.insert(poLineId);
//		Product p = new Product(10,"Stuff", "It's stuff", "STU", 100,"box",3,5,10,100,100,null);
//		dataLayer.insert(p);
//		PoLine poLine = new PoLine(poLineId,100,10,p);
//		dataLayer.insert(poLine);
//		System.out.println("Complete");
	}

}
