package com.easydoordelivery.service;

import org.hibernate.Session;

import com.easydoordelivery.model.Shippers;

public interface ShippersService {
	public void save(Shippers ship, Session session);
	public Session beginSession();
	public void endSession(Session session);
}
