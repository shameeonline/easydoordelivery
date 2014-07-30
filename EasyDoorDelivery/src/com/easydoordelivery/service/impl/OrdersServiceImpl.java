package com.easydoordelivery.service.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.easydoordelivery.model.Orders;
import com.easydoordelivery.repository.impl.OrdersRepositoryImpl;
import com.easydoordelivery.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {
	@Autowired
	OrdersRepositoryImpl ordersRepositoryImpl;

	@Override
	public void save(Orders ord, Session session) {
		ordersRepositoryImpl.save(ord, session);		
	}
	public Session beginSession(){
		return ordersRepositoryImpl.beginSession();
	}
	public void endSession(Session session){
		ordersRepositoryImpl.endSession(session);
	}
}
