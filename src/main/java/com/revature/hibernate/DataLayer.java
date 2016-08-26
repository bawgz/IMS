package com.revature.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.beans.Client;
import com.revature.beans.ClientType;
import com.revature.beans.Product;
import com.revature.beans.ProductCategory;
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

	public List<Product> getProducts() {
		return dao.getProducts();
	}

	public List<ClientType> getClientTypes() {
		return dao.getClientTypes();
	}
	
	public List<StateAbbrv> getStateAbbrvs() {
		return dao.getStateAbbrvs();
	}

	public void update(Object obj) {
		Transaction tx = session.beginTransaction();
		try {
			dao.update(obj);	//can call multiple daos or dao methods
			tx.commit();
			System.out.println("Object updated");
		}
		catch(Throwable t) {
			tx.rollback();
			t.printStackTrace();
		}
	}

	public List<Client> getClients() {
		return dao.getClients();
	}

	public Product getProductByUpc(int upc) {
		return dao.getProductByUpc(upc);
	}

	public boolean deleteProductByUpc(int upc) {
		Product p = dao.getProductByUpc(upc);
		Transaction tx = session.beginTransaction();
		try {
			dao.delete(p);	//can call multiple daos or dao methods
			tx.commit();
			return true;
		}
		catch(Throwable t) {
			tx.rollback();
			t.printStackTrace();
			return false;
		}
	}
	
	public List<Client> getClientById(int i) {
		return dao.getClientById(i);
	}

	public Client getClientObjectById(int clientId) {
		return dao.getClientObjectById(clientId);
	}

	public void deleteClientById(int id) {
		Client c = dao.getClientObjectById(id);
		Transaction tx = session.beginTransaction();
		try{
			dao.delete(c);
			dao.delete(c.getAddress());
			tx.commit();
			System.out.println("Deleted");
		}
		catch(Throwable t) {
			tx.rollback();
			t.printStackTrace();
			System.out.println("You suck");
		}
	}
	
}