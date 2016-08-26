package com.revature.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.revature.beans.Client;
import com.revature.beans.ClientType;
import com.revature.beans.Product;
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

	public List<Product> getProducts() {
		Query query = session.createQuery("from Product");
		return query.list();
	}

	public List<ClientType> getClientTypes() {
		Query query = session.createQuery("from ClientType");
		return query.list();
	}

	public List<Client> getClientById(int i) {
		Criteria criteria = session.createCriteria(Client.class);
		criteria.add(Restrictions.eq("clientType.clientTypeId", i));
		return criteria.list();
		
	}

	public void update(Object obj) {
		session.update(obj);
	}

	public Product getProductById(int productId) {
		Criteria criteria = session.createCriteria(Product.class).add(Restrictions.eq("productUpc", productId));
		return (Product) criteria.uniqueResult();
	}
}
