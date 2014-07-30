package com.easydoordelivery.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;






import com.easydoordelivery.model.Categories;
import com.easydoordelivery.repository.impl.CategoriesRepositoryImpl;
import com.easydoordelivery.service.CategoriesService;

public class CategoriesServiceImpl implements CategoriesService {
	@Autowired
	CategoriesRepositoryImpl categoriesRepositoryImpl;
	@Override
	public void save(Categories cat, Session session){ 
		categoriesRepositoryImpl.save(cat, session);
	}

	public Categories readById(int id, Object obj, Session session) {
		 return categoriesRepositoryImpl.readById(id, obj, session);		
	}
	
	/*public List<Object> listAllCategories(){
		return categoriesRepositoryImpl.listAllCategories();
	}*/

	public Session beginSession(){
		return categoriesRepositoryImpl.beginSession();
	}
	public void endSession(Session session){
		categoriesRepositoryImpl.endSession(session);
	}
	
	public void readAllRecord(Object obj){
		categoriesRepositoryImpl.readAllRecord(obj);;
	}
	
		public void useFilter(){
		categoriesRepositoryImpl.useFilter();
	}

		@Override
		public void readProductFromCategory() {
			// TODO Auto-generated method stub
			
		}
	
}