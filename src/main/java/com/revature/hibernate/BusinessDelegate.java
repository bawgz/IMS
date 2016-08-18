package com.revature.hibernate;

import java.util.List;

import com.revature.beans.Product;
import com.revature.beans.ProductCategory;

public class BusinessDelegate {

	public List<ProductCategory> getProductCategories(){
		return new DataLayer().getProductCategories();
	}

	public void insert(Object obj) {
		new DataLayer().insert(obj);
	}
}
