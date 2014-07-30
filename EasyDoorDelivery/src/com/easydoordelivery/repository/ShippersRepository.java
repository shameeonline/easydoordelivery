package com.easydoordelivery.repository;

import org.hibernate.Session;

public interface ShippersRepository {
	public  void save(Object obj, Session session);
	public Session beginSession();
	public void endSession(Session session);
}
