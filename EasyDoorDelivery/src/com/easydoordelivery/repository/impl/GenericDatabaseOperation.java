package com.easydoordelivery.repository.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.easydoordelivery.model.Categories;
import com.easydoordelivery.model.OrderDetails;
import com.easydoordelivery.model.Orders;
import com.easydoordelivery.model.Products;
import com.easydoordelivery.model.Suppliers;
import com.easydoordelivery.util.AuditLogInterceptor;
@Repository
public  class GenericDatabaseOperation {
	
	@Autowired
	 private SessionFactory sessionFactory;
	@Autowired	
	AuditLogInterceptor auditLogInterceptor;
			
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession(){
		return sessionFactory.openSession(auditLogInterceptor);
	}
	public Session beginSession(){
		Session session = getSession();
		session.beginTransaction();		
		return session;
	}
	public void endSession(Session session){
		session.getTransaction().commit();
		session.close();
	}
	public void save(Object obj, Session session){
		session.save(obj);
		System.out.println("saved");
		session.getTransaction().commit();
	}
	
	public Object readById(int id, Object obj, Session session){
		Object add = null;
		String className= obj.getClass().getName();
		System.out.println();
		System.out.println("details");
		add = (Object) session.get(className, id);
		return add;
	}
	public void displayProducts(Products obj){
		System.out.println();
		System.out.println("Product Details");
		System.out.println("---------------");
		System.out.println("product name : " +obj.getProductName());
		System.out.println("unit : " +obj.getUnit());
		System.out.println("Price : "+ obj.getPrice());
		displayCategories(obj.getCategory());
		displaySuppliers(obj.getSupplier());
		return;
	}
	
	private void displayCategories(Categories add) {
		System.out.println();
		System.out.println("Categories Details");
		System.out.println("------------------");
		System.out.println("Category Name : " +add.getCategoryName());
		System.out.println("Description : " +add.getDescription());
		System.out.println("product from category");
	}
	
	public void displayOrderDetails(OrderDetails ord){
		System.out.println();
		System.out.println("orderdetails display");
		System.out.println("--------------------");
		System.out.println("Order quantity : " + ord.getQuantity());
		displayOrders(ord.getOrder());
	}
	private void displayOrders(Orders ord){
		System.out.println();
		System.out.println("Order details");
		System.out.println("-------------");
		System.out.println("Order date : "+ ord.getOrderDate());
	}
	
	public void displaySuppliers(Suppliers obj){
		System.out.println();
		System.out.println("Supplier Details");
		System.out.println("----------------");
		System.out.println("Supplier Name : " + obj.getSupplierName());
		System.out.println("Contact Name : " + obj.getContactName());
		System.out.println("Phone : " + obj.getPhone());
		System.out.println("Address : " + obj.getSupplierAddress().getAddress());
		System.out.println("City : " + obj.getSupplierAddress().getCity());
		System.out.println("Country : " + obj.getSupplierAddress().getCountry());
		System.out.println("Postal Code : " + obj.getSupplierAddress().getPostalCode());
	}
	
	public void update(Object obj, Session session){
		if(obj == null) System.out.println("Null object cannot be updated");
		else System.out.println("The object is Not null ");
		session.update(obj);
		session.getTransaction().commit();
	}
	
	/*public void readAllRecords(Object obj){
		Session session = getSession();
		String str = obj.getClass().getName();
		System.out.println();
		System.out.println("From Read all record");
		System.out.println();
		Query query = session.createQuery("from "+ sYGT5 FRV4DXtr);
		List<Object> cust =  query.list();
		System.out.println("Display all records");
		//System.out.println(cust.toString());
		for(Object custList : cust){
			System.out.println();
			System.out.println(custList.);
		}
		session.close();
		//return cust;
	}*/
	
	public void readAllRecords(Object obj){
		Session session = getSession();
		String str = obj.getClass().getName();
		System.out.println();
		System.out.println("From Read all record");
		System.out.println();
		Query query = session.createQuery("from "+ str);
		List<Object> cust =  query.list();
		System.out.println("Display all records");
		//System.out.println(cust.toString());
		Object obj1 = cust.get(0);
		if(obj1 instanceof Products){
			for(Object custList : cust){
				displayProducts((Products)custList);
			}
		}
		else {
			for(Object custList: cust){
				displayCategories((Categories)custList);
			}
		}
		session.close();
		//return cust;
	}
	
	public void updateProduct(int id, String updatedName){
		List<Categories> cat = new ArrayList<Categories>();
		Session session = getSession();
		session.beginTransaction();
		System.out.println();
		System.out.println("details");
		//add = (Categories) session.get(Categories.class, id);
		Query query = session.createQuery("FROM Categories C WHERE C.categoryid = "+ id);
		cat = query.list();
		for(Categories catList:cat ){
		/*	for(Products prodList : catList.getProducts()   ){
				prodList.setProductName(updatedName);
				session.update(prodList);
				displayProducts(prodList);
			}*/
		}
		session.getTransaction().commit();
		
		session.close();
	}
	
	
	public void delete(Object obj){
		Session session = getSession();
		session.beginTransaction();
		session.delete(obj);
		session.getTransaction().commit();
		session.close();
	}
}

