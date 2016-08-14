package com.revature.hibernate;

import org.hibernate.Session;

public class HibernateDao {

	private Session session;
	
	public HibernateDao(Session session) {
		this.session = session;
	}

	public void insert(Object obj) {
		session.save(obj);
	}
	
}
