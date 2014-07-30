package com.easydoordelivery.repository;

import org.hibernate.Session;

import com.easydoordelivery.model.OrderDetails;

public interface OrderDetailsRepository {
	public Session beginSession();
	public void endSession(Session session);
	public  void save(Object obj, Session session);
	public void update(Object obj, Session session);
	public Object readById(int id, Object ord, Session session);
}
