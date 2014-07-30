package com.easydoordelivery.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.easydoordelivery.model.Categories;
import com.easydoordelivery.model.Products;
import com.easydoordelivery.repository.ProductsRepository;
import com.easydoordelivery.util.AuditLogInterceptor;
@Repository
public class ProductsRepositoryImpl extends GenericDatabaseOperation implements ProductsRepository {
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
		genericDB.save(obj,session);
	}

	@Override
	public void update(Object obj, Session session) {
		genericDB.update(obj, session);		
	}

	@Override
	public Products readById(int id, Object obj, Session session) {
		return (Products)genericDB.readById(id, obj, session);	}

	@Override
	public void updateProduct(Products prod, Session session) {
		genericDB.update(prod, session);
		
	}
	
	public void displayProducts(Products obj){
		genericDB.displayProducts(obj);
	}
	public void readAllRecord(Object obj){
		genericDB.readAllRecords(obj);
	}
}