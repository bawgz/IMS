package com.revature.hibernate;

import java.util.List;

import com.revature.beans.ClientType;
import com.revature.beans.Product;
import com.revature.beans.ProductCategory;
import com.revature.beans.StateAbbrv;

public class BusinessDelegate {

	public List<ProductCategory> getProductCategories(){
		return new DataLayer().getProductCategories();
	}
	
	public List<StateAbbrv> getStateAbbrvs() {
		return new DataLayer().getStateAbbrvs();
	}
	
	public List<ClientType> getClientTypes() {
		return new DataLayer().getClientTypes();
	}

	public void insert(Object obj) {
		new DataLayer().insert(obj);
	}
}
