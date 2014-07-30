package com.easydoordelivery.repository.impl;

import org.hibernate.Session;

import com.easydoordelivery.model.OrderDetails;
import com.easydoordelivery.repository.OrderDetailsRepository;

public class OrderDetailsRepositoryImpl implements OrderDetailsRepository {
	GenericDatabaseOperation genericDB;

	public GenericDatabaseOperation getGenericDB() {
		return genericDB;
	}

	public void setGenericDB(GenericDatabaseOperation genericDB) {
		this.genericDB = genericDB;
	}
	public void save(Object obj, Session session) {
		genericDB.save(obj, session);
	}
	public void update(Object obj, Session session){
		genericDB.update(obj, session);
	}

	public Session beginSession(){
		return genericDB.beginSession();
	}
	public void endSession(Session session){
		genericDB.endSession(session);
	}
	@Override
	public Object readById(int id, Object ord, Session session) {
		return genericDB.readById(id, ord, session);
	}

	public void displayOrderDetails(OrderDetails ord){
		genericDB.displayOrderDetails(ord);
	}
	
}
