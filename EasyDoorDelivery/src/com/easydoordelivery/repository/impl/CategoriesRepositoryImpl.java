package com.easydoordelivery.repository.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.easydoordelivery.model.Categories;
import com.easydoordelivery.model.Products;
import com.easydoordelivery.repository.CategoriesRepository;
import com.easydoordelivery.util.AuditLogInterceptor;
@Repository
public class CategoriesRepositoryImpl implements CategoriesRepository {
	
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
	public Categories readById(int id, Object obj, Session session){
		return (Categories)genericDB.readById(id, obj, session);
	}

	@Override
	public void save(Object obj, Session session) {
		genericDB.save(obj, session);
	}
	
	public void readAllRecord(Object obj){
		genericDB.readAllRecords(obj);
	}
	
	
	public void useFilter(){
		/*Session session = genericDB.getSession();
		Categories cat = new Categories();
		cat = (Categories)genericDB.readById(1, cat);
		System.out.println();
		System.out.println("in use filter method ");
		System.out.println();
		Collection<Products> productList =  session.createFilter(cat.getProducts(),"").list();
		System.out.println("Prod size ="+productList.size());
		for(Object obj: productList){
			genericDB.displayProducts((Products)obj);
		}*/
		
	}
}