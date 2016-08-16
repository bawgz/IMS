package com.revature.hibernate;

import org.hibernate.*;

import com.revature.beans.StateAbbrv;

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
	
<<<<<<< HEAD
	public void insert(Object obj) {
=======
	public void insertObject(Object obj) {
>>>>>>> 61b3ae1bba06885eeabb6f1e58fbabe5bfc7fb09
		Transaction tx = session.beginTransaction();
		try {
			dao.insert(obj);	//can call multiple daos or dao methods
			tx.commit();
		}
		catch(Throwable t) {
			tx.rollback();
		}
	}
	
}