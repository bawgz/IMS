package com.revature.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.beans.ProductCategory;

//data service
//data layer
//many names
//delegate design pattern
//entry point between middle tier and back-end
public class DataLayer {

	private Session session;	//implement a session-per-request (best practice)
	private HibernateDao dao;
	
	public DataLayer() {
		session = SessionFactoryManager.getInstance().openSession();
		dao = new HibernateDao(session);
	}

	public void close() {
		if(session != null) session.close();
	}
	
	public void insert(Object obj) {
		Transaction tx = session.beginTransaction();
		try {
			dao.insert(obj);	//can call multiple daos or dao methods
			tx.commit();
			System.out.println("Object added");
		}
		catch(Throwable t) {
			tx.rollback();
			t.printStackTrace();
		}
	}
	
	public List<ProductCategory> getProductCategories() {
		return dao.getProductCategories();
	}
	
}