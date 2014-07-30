package com.easydoordelivery.service;

import org.hibernate.Session;

import com.easydoordelivery.model.Products;

public interface ProductsService {
	public Session beginSession();
	public void endSession(Session session);
	public void save(Products cat, Session session);
	public Products readById(int id, Object obj, Session session);
//	public List<Products> listAllProducts();
	public void updateProduct(Products prod, Session session);
	public void readAllRecord(Object obj);
	public void displayProducts(Products obj);

}
