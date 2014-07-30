package com.easydoordelivery.service.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.easydoordelivery.model.Customers;
import com.easydoordelivery.repository.impl.CustomersRepositoryImpl;
import com.easydoordelivery.service.CustomersService;

public class CustomersServiceImpl implements CustomersService {
	@Autowired
	CustomersRepositoryImpl customersRepositoryImpl;
	@Override
	public void save(Customers cat, Session session) {
		customersRepositoryImpl.save(cat, session);
	}
	public Session beginSession(){
		return customersRepositoryImpl.beginSession();
	}
	public void endSession(Session session){
		customersRepositoryImpl.endSession(session);
	}
}
