package com.revature.hibernate;

import java.util.List;

import com.revature.beans.Client;
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

	public void insert(Object obj) {
		new DataLayer().insert(obj);
	}

	public List<Product> getProducts() {
		return new DataLayer().getProducts();
	}

	public List<ClientType> getClientTypes() {
		return new DataLayer().getClientTypes();
	}

	public List<Client> getClientById(int i) {
		return new DataLayer().getClientById(i);
	}

	public void update(Object obj) {
		new DataLayer().update(obj);
	}

	public List<Client> getClients() {
		return new DataLayer().getClients();
	}

	public Product getProductByUpc(int upc) {
		return new DataLayer().getProductByUpc(upc);
		
	}

	public boolean deleteProductByUpc(int upc) {
		return new DataLayer().deleteProductByUpc(upc);
	}
}
