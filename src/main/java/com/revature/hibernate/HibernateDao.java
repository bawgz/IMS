package com.revature.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.revature.beans.ClientType;
import com.revature.beans.ProductCategory;
import com.revature.beans.StateAbbrv;

public class HibernateDao {

	private Session session;
	
	public HibernateDao(Session session) {
		this.session = session;
	}

	public void insert(Object obj) {
		session.save(obj);
	}
	
	public List<ProductCategory> getProductCategories() {
		Query query = session.createQuery("from ProductCategory");
		return query.list();
	}
	
	public List<StateAbbrv> getStateAbbrvs() {
		Query query = session.createQuery("from StateAbbrv");
		return query.list();
	}
	
	public List<ClientType> getClientTypes() {
		Query query = session.createQuery("from ClientType");
		return query.list();
	}
	
}
