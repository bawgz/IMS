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

		StateAbbrv sa = new StateAbbrv(1,"Alabama","AL");
		Address a = new Address(51,"Hello","World","Yes",sa,"60510");
//		dataLayer.insert(a);

		ClientType ct = new ClientType(1,"Supplier");
//		dataLayer.insert(ct);
		Client client = new Client(1, "Luke", "luke@ok", "Nick", "8675309", "yeah", a, ct);
//		dataLayer.insert(client);
		PurchaseOrder po = new PurchaseOrder(1, 100, new Date(), 10, 110, client);
//		dataLayer.insert(po);
		Product p = new Product(1,"Stuff", "It's stuff", "STU", 100,"box",3,5,10,100,100,null);
//		dataLayer.insert(p);
		PoLineId poLineId = new PoLineId(po,1);
		PoLine poLine = new PoLine(poLineId,100,10,p);
//		dataLayer.insert(poLine);
		Product p2 = new Product(2,"More Stuff", "It's stuff", "STU", 100,"box",3,5,10,100,100,null);
//		dataLayer.insert(p2);
		ProductCategory pc = new ProductCategory(1, "Cool category");
		Set<Product> products = new HashSet<Product>();
		products.add(p);
		products.add(p2);
		pc.setProducts(products);
		dataLayer.insert(pc);
//		Product p3 = new Product(59,"Cool and fun", "It's stuff", "STU", 100,"box",3,5,10,100,100,null);
//		Product p4 = new Product(60,"Fun", "It's stuff", "STU", 100,"box",3,5,10,100,100,null);
//		ProductCategory pc2 = new ProductCategory(61, "Fun");
//		Set<ProductCategory> p3Categories = new HashSet<ProductCategory>();
//		p3Categories.add(pc);
//		p3Categories.add(pc2);
//		p3.setProductCategories(p3Categories);
//		Set<Product> pc2Products = new HashSet<Product>();
//		pc2Products.add(p4);
//		pc2Products.add(p3);
//		pc2.setProducts(pc2Products);
//		dataLayer.insert(p3);
//		dataLayer.insert(p4);
//		dataLayer.insert(pc2);
//		System.out.println("Complete");
	
	}

}
