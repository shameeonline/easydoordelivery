package com.easydoordelivery.service.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.easydoordelivery.model.Employees;
import com.easydoordelivery.repository.impl.EmployeesRepositoryImpl;
import com.easydoordelivery.service.EmployeesService;

public class EmployeesServiceImpl implements EmployeesService{

	@Autowired
	EmployeesRepositoryImpl employeesRepositoryImpl;
	@Override
	public void save(Employees emp, Session session) {
		employeesRepositoryImpl.save(emp, session);
	}
	public Session beginSession(){
		return employeesRepositoryImpl.beginSession();
	}
	public void endSession(Session session){
		employeesRepositoryImpl.endSession(session);
	}
}
