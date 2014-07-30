package com.easydoordelivery.client;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import com.easydoordelivery.facade.EasyDoorDeliverFacade;
import com.easydoordelivery.model.OrderDetails;
import com.easydoordelivery.model.Products;

public class GenericServiceClient extends EasyDoordeliveryMock{
	private EasyDoorDeliverFacade  facade=new EasyDoorDeliverFacade();
	Products product = new Products();
	OrderDetails orderDetails = new OrderDetails();
	/*//@Test
	public void testSaveOrder(){
		System.out.println("Welcome1");

		EasyDoorDeliverFacade  facade1=new EasyDoorDeliverFacade();
		System.out.println("Welcome111");
		facade1.saveOrderDetails(getMockOrderDetails());
	} 
	
	//@Test
	public void testSaveProducts(){
	//	facade.saveProducts(getMockProduct());
	}
	
	//@Test
	public void testSaveCategories(){
		facade.saveCatogories(getMockCategories());
	} 
	
	//@Test
	public void testSaveSuppliers(){
		facade.saveSuppliers(getMockSuppliers());
	} 
	
	//@Test
	public void testSaveOrders(){
		facade.saveOrders(getMockOrders());
	} 
	
	//@Test
	public void testSaveCustomers(){
		facade.saveCustomers(getMockCustomers());
	} 
	
	//@Test
	public void testSaveEmployees(){
		facade.saveEmployees(getMockEmployees());
	} 
	
	//@Test
	public void testSaveShippers(){
		facade.saveShippers(getMockShippers());
	}
	*/
	/*public void SaveSuppliers(){
		facade.saveSuppliers(getMockSuppliers());
	} 
	public void SaveCategories(){
		facade.saveCatogories(getMockCategories());
	}*/
	public Session beginSession(){
		return facade.beginSession();
	}
	public void endSession(Session session){
		facade.endSession(session);
	}
	public void testsaveProducts(Session session){
		facade.saveProducts(getMockProduct(), session);
	}
	
	public void testreadProductsById(int id, Products prod, Session session){
		product = facade.readProductsById(id, prod, session);	
		testdisplayProducts(product);
	}
	
	public void testdisplayProducts(Products prod){
		facade.displayProducts(prod);
	}
	public void testsaveOrderDetails(Session session){
		facade.saveOrderDetails(getMockOrderDetails(), session);
	}
	public void testupdateProduct(Session session){
		product.setProductName("Updated product Name");
		product.getCategory().setCategoryName("Updated category Name");
		product.getSupplier().setSupplierName("Updated supplier Name");
		facade.updateProduct(product, session);
	}
	public void testDisplayOrderDetails(OrderDetails ord){
		facade.displayOrderDetails(ord);
	}
	public void testUpdateOrderDetails(OrderDetails ord, Session session){
		if(ord == null) System.out.println("ord is null");
		System.out.println("ghjghg");
		ord.getOrder().setOrderDate(new Date());
		ord.setQuantity(200);
		System.out.println("update fn");
		testDisplayOrderDetails(ord);
		facade.updateOrderDetails(ord, session);
	}
	public OrderDetails testOrderDetailsReadById(int id, OrderDetails ord, Session session){
		return facade.readOrderDetailsById(1, ord, session);
	}
	public static void main(String[] args) {
		//new GenericServiceClient().testsaveProducts();
		//new GenericServiceClient().testreadProductsById(1, new Products());
		//new GenericServiceClient().testupdateProduct();
		//new GenericServiceClient().testsaveOrderDetails();
		Session session = new GenericServiceClient().beginSession();
		OrderDetails ord = new GenericServiceClient().testOrderDetailsReadById(1, new OrderDetails(), session);
		new GenericServiceClient().testDisplayOrderDetails(ord);
		new GenericServiceClient().testUpdateOrderDetails(ord, session);
		ord = null;
		ord = new GenericServiceClient().testOrderDetailsReadById(1, new OrderDetails(), session);
		new GenericServiceClient().testDisplayOrderDetails(ord);
	//	new GenericServiceClient().endSession(session);
	}
}
