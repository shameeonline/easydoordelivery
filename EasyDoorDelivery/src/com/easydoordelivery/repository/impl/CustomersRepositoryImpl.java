package com.easydoordelivery.repository.impl;

import org.hibernate.Session;

import com.easydoordelivery.repository.CustomersRepository;

public class CustomersRepositoryImpl implements CustomersRepository {
	GenericDatabaseOperation genericDB;

	public GenericDatabaseOperation getGenericDB() {
		return genericDB;
	}

	public void setGenericDB(GenericDatabaseOperation genericDB) {
		this.genericDB = genericDB;
	}
	public Session beginSession(){
		return genericDB.beginSession();
	}
	public void endSession(Session session){
		genericDB.endSession(session);
	}
	@Override
	public void save(Object obj, Session session) {
		genericDB.save(obj, session);		
	}
}
