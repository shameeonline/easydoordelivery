package com.easydoordelivery.repository.impl;

import org.hibernate.Session;

import com.easydoordelivery.repository.ShippersRepository;

public class ShippersRepositoryImpl implements ShippersRepository{
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
	public void save(Object obj, Session session) {
		genericDB.save(obj,session);
	}
}
