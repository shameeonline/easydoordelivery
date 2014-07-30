package com.easydoordelivery.service;

import org.hibernate.Session;

import com.easydoordelivery.model.OrderDetails;

public interface OrderDetailsService {
	public Session beginSession();
	public void endSession(Session session);
	public void save(OrderDetails ord, Session session);
	public void update(OrderDetails ord, Session session); 
	public OrderDetails readById(int id, OrderDetails ord, Session session);
	public void displayOrderDetails(OrderDetails ord);
}
