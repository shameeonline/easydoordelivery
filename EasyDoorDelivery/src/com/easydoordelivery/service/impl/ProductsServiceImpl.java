package com.easydoordelivery.service.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.easydoordelivery.model.Products;
import com.easydoordelivery.repository.impl.ProductsRepositoryImpl;
import com.easydoordelivery.service.ProductsService;

public class ProductsServiceImpl implements ProductsService{
	@Autowired
	ProductsRepositoryImpl ProductsRepositoryImpl;
	@Override
	public void save(Products cat, Session session){ 
		ProductsRepositoryImpl.save(cat, session);
	}

	public Products readById(int id, Object obj, Session session) {
		 return ProductsRepositoryImpl.readById(id, obj, session);		
	}
	
	/*public List<Object> listAllProducts(){
		return ProductsRepositoryImpl.listAllProducts();
	}*/

	@Override
	public void readAllRecord(Object obj) {
		ProductsRepositoryImpl.readAllRecord(obj);
	}

	@Override
	public void updateProduct(Products prod, Session session) {
		ProductsRepositoryImpl.updateProduct(prod, session);		
	}

	@Override
	public void displayProducts(Products obj) {
		ProductsRepositoryImpl.displayProducts(obj);
	}
	public Session beginSession(){
		return ProductsRepositoryImpl.beginSession();
	}
	public void endSession(Session session){
		ProductsRepositoryImpl.endSession(session);
	}
}
