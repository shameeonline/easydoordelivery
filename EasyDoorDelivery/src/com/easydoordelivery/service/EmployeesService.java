package com.easydoordelivery.service;

import org.hibernate.Session;

import com.easydoordelivery.model.Employees;

public interface EmployeesService {
	public void save(Employees emp, Session session);
	public Session beginSession();
	public void endSession(Session session);
}
