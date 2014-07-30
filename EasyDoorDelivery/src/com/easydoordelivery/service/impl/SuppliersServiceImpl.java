package com.easydoordelivery.service.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.easydoordelivery.repository.impl.SuppliersRepositoryImpl;
import com.easydoordelivery.service.SuppliersService;

public class SuppliersServiceImpl implements SuppliersService {
	@Autowired
	private SuppliersRepositoryImpl supplierRepositoryImpl;
	
	public SuppliersRepositoryImpl getSupplierRepositoryImpl() {
		return supplierRepositoryImpl;
	}


	public void setSupplierRepositoryImpl(
			SuppliersRepositoryImpl supplierRepositoryImpl) {
		this.supplierRepositoryImpl = supplierRepositoryImpl;
	}
	public Session beginSession(){
		return supplierRepositoryImpl.beginSession();
	}
	public void endSession(Session session){
		supplierRepositoryImpl.endSession(session);
	}

	public void save(Object obj, Session session) {
		supplierRepositoryImpl.save(obj, session);
	}
}
	