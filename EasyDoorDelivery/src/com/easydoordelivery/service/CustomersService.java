package com.easydoordelivery.service;

import org.hibernate.Session;

import com.easydoordelivery.model.Customers;

public interface CustomersService {
	public Session beginSession();
	public void endSession(Session session);
	public void save(Customers cat, Session session);
}
