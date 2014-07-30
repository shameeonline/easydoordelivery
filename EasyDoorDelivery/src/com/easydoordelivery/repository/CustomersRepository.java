package com.easydoordelivery.repository;

import org.hibernate.Session;

public interface CustomersRepository {
	public Session beginSession();
	public void endSession(Session session);
	public void save(Object obj, Session session);
}
