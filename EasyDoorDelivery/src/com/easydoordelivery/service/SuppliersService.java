package com.easydoordelivery.service;

import org.hibernate.Session;

public interface SuppliersService {
	public Session beginSession();
	public void endSession(Session session);
	public void save(Object obj, Session session);
}
