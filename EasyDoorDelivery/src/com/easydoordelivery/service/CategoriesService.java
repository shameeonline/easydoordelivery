package com.easydoordelivery.service;


import org.hibernate.Session;

import com.easydoordelivery.model.Categories;

public interface CategoriesService {
	public Session beginSession();
	public void endSession(Session session);
	public void save(Categories cat, Session session);
	public Categories readById(int id, Object obj, Session session);
//	public List<Categories> listAllCategories();
	public void readAllRecord(Object obj);
	public void readProductFromCategory();
	public void useFilter();
}
