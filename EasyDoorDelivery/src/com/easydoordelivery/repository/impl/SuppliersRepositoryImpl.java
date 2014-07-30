package com.easydoordelivery.repository.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.easydoordelivery.repository.SuppliersRepository;

@Repository
public class SuppliersRepositoryImpl implements SuppliersRepository{
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
		genericDB.save(obj, session);
	}
	
}
