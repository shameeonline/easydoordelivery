package com.easydoordelivery.service;

import org.hibernate.Session;

import com.easydoordelivery.model.Orders;

public interface OrdersService {
	public Session beginSession();
	public void endSession(Session session);
	public void save(Orders ord, Session session);
}
