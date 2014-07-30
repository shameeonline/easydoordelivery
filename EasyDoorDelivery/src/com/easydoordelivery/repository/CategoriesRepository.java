package com.easydoordelivery.repository;

import java.util.List;

import org.hibernate.Session;

import com.easydoordelivery.model.Categories;

public interface CategoriesRepository {
	public Session beginSession();
	public void endSession(Session session);
	public  void save(Object obj, Session session);
	public Categories readById(int id, Object obj, Session session);
//	public void listAllCategories();
	public void readAllRecord(Object obj);
//	public void readProductFromCategory();
}
