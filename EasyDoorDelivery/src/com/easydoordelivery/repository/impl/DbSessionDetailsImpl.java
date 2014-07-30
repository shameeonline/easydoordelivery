package com.easydoordelivery.repository.impl;

import org.hibernate.Session;

import com.easydoordelivery.repository.DbSessionDetails;

public class DbSessionDetailsImpl implements DbSessionDetails{
	GenericDatabaseOperation genericDB;
	
	public GenericDatabaseOperation getGenericDB() {
		return genericDB;
	}

	public void setGenericDB(GenericDatabaseOperation genericDB) {
		this.genericDB = genericDB;
	}
	
	
	@Override
	public void beginSession() {
		genericDB.beginSession();
	}

	@Override
	public void endSession(Session session) {
		genericDB.endSession(session);		
	}

}
