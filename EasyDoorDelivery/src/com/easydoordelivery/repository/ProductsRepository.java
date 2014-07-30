package com.easydoordelivery.repository;

import org.hibernate.Session;

import com.easydoordelivery.model.Products;

public interface ProductsRepository {
	public  void save(Object obj, Session session);
	public Products readById(int id, Object obj, Session session);
//	public void listAllCategories();
	public void updateProduct(Products prod, Session session);
	public void readAllRecord(Object obj);
	public void displayProducts(Products obj);
	public Session beginSession();
	public void endSession(Session session);

}
