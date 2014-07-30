package com.easydoordelivery.service.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.easydoordelivery.model.Shippers;
import com.easydoordelivery.repository.impl.ShippersRepositoryImpl;
import com.easydoordelivery.service.ShippersService;

public class ShippersServiceImpl implements ShippersService{
	@Autowired
	ShippersRepositoryImpl shippersRepositoryImpl;

	@Override
	public void save(Shippers ship, Session session) {
		shippersRepositoryImpl.save(ship, session);
	}
	public Session beginSession(){
		return shippersRepositoryImpl.beginSession();
	}
	public void endSession(Session session){
		shippersRepositoryImpl.endSession(session);
	}
}
