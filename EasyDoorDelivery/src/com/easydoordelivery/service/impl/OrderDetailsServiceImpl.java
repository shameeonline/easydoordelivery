package com.easydoordelivery.service.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.easydoordelivery.model.OrderDetails;
import com.easydoordelivery.repository.impl.OrderDetailsRepositoryImpl;
import com.easydoordelivery.service.OrderDetailsService;

public class OrderDetailsServiceImpl implements OrderDetailsService {
	@Autowired
	OrderDetailsRepositoryImpl orderDetailsRepositoryImpl;
	
	@Override
	public void save(OrderDetails ord,Session session) {
		orderDetailsRepositoryImpl.save(ord, session);
	}

	@Override
	public void update(OrderDetails ord, Session session) {
		orderDetailsRepositoryImpl.update(ord, session);
	}

	@Override
	public OrderDetails readById(int id, OrderDetails ord, Session session) {
		return (OrderDetails)orderDetailsRepositoryImpl.readById(id, ord, session);
	}

	@Override
	public void displayOrderDetails(OrderDetails ord) {
		orderDetailsRepositoryImpl.displayOrderDetails(ord);
	}

	public Session beginSession(){
		return orderDetailsRepositoryImpl.beginSession();
	}
	public void endSession(Session session){
		orderDetailsRepositoryImpl.endSession(session);
	}
	
}
