package com.easydoordelivery.client;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.easydoordelivery.model.Categories;
import com.easydoordelivery.model.CustomerAddress;
import com.easydoordelivery.model.Customers;
import com.easydoordelivery.model.Employees;
import com.easydoordelivery.model.OrderDetails;
import com.easydoordelivery.model.Orders;
import com.easydoordelivery.model.Products;
import com.easydoordelivery.model.Shippers;
import com.easydoordelivery.model.SupplierAddress;
import com.easydoordelivery.model.Suppliers;

public abstract class EasyDoordeliveryMock {
	
	protected static final Products getMockProduct(){
		Products products = new Products();
		
		/*Set<OrderDetails> orderDetList = new HashSet<OrderDetails>();
		orderDetList.add(getMockOrderDetails());
		orderDetList.add(getMockOrderDetails());*/
		
		products.setProductName("ProductName1");
		products.setPrice(100.00);
		products.setUnit(500);
		products.setCategory(getMockCategories());
		products.setSupplier(getMockSuppliers());
	//	products.setOrderDetailList(orderDetList);
		return products;
	}
	
	protected static final Categories getMockCategories(){
		Categories categories= new Categories();
		
		/*Set<Products> prod = new HashSet<Products>();
		prod.add(getMockProduct());
		prod.add(getMockProduct());
		*/
	
		categories.setCategoryName("categoryName1");
		categories.setDescription("description1");
		//categories.setProducts(prod);
		
		return categories;
	}
	protected static final SupplierAddress getMockSupplierAddress(){
		SupplierAddress supAddress = new SupplierAddress();
		supAddress.setAddress("address1");
		supAddress.setCity("city1");
		supAddress.setCountry("country1");
		supAddress.setPostalCode("postalCode1");
		return supAddress;
	}
	protected static final Suppliers getMockSuppliers(){
		Suppliers suppliers = new Suppliers();
		
		/*Set<Products> prod = new HashSet<Products>();
		prod.add(getMockProduct());
		prod.add(getMockProduct());*/
		
		suppliers.setContactName("contactName1");
		suppliers.setPhone("phone1");
		suppliers.setSupplierName("supplierName1");
		suppliers.setSupplierAddress(getMockSupplierAddress());
		//suppliers.setProducts(prod);
		return suppliers;
	}
	
	protected static final CustomerAddress getMockCustomerAddress(){
		CustomerAddress add = new CustomerAddress();
		add.setAddress("address1");
		add.setCity("city1");
		add.setCountry("country1");
		add.setPostalCode("postalCode1");
		return add;
	}
	
	protected static final OrderDetails getMockOrderDetails(){
		OrderDetails ord = new OrderDetails();
		ord.setQuantity(100);
		ord.setOrder(getMockOrders());
		return ord;
	}
	
	protected static final Orders getMockOrders(){
		Orders ord = new Orders();
		
		/*Set<OrderDetails> orderDetList = new HashSet<OrderDetails>();
		orderDetList.add(getMockOrderDetails());
		orderDetList.add(getMockOrderDetails());*/
		//ord.setOrderDetailList(orderDetList);
		
		ord.setOrderDate(new Date());
		return ord;
	}
	
	protected static final Customers getMockCustomers(){
		Customers cust = new Customers();
		
		Set<Orders> ordList = new HashSet<Orders>();
		ordList.add(getMockOrders());
		ordList.add(getMockOrders());
		
		cust.setCustomerName("customerName1");
		cust.setContactName("contactName1");
		cust.setCustomerAddress(getMockCustomerAddress());
		cust.setOrderList(ordList);
		return cust;
	}
	
	protected static final Employees getMockEmployees(){
		Employees emp = new Employees();
		
		Set<Orders> ordList = new HashSet<Orders>();
		ordList.add(getMockOrders());
		ordList.add(getMockOrders());
		
		emp.setFirstName("firstName1");
		emp.setLastName("lastName1");
		emp.setBirthDate(new Date());
		emp.setPhoto("photo1");
		emp.setNotes("notes1");
		emp.setOrderList(ordList);
		return emp;
	}
	
	protected static final Shippers getMockShippers(){
		Shippers ship = new Shippers();
		
		Set<Orders> ordList = new HashSet<Orders>();
		ordList.add(getMockOrders());
		ordList.add(getMockOrders());
		
		ship.setShipperName("shipperName1");
		ship.setPhone("phone1");
		ship.setOrderList(ordList);
		return ship;
	}
	
	
}
