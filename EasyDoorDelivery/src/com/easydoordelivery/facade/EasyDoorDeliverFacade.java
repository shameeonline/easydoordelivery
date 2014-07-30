package com.easydoordelivery.facade;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easydoordelivery.model.Categories;
import com.easydoordelivery.model.Customers;
import com.easydoordelivery.model.Employees;
import com.easydoordelivery.model.OrderDetails;
import com.easydoordelivery.model.Orders;
import com.easydoordelivery.model.Products;
import com.easydoordelivery.model.Shippers;
import com.easydoordelivery.model.Suppliers;
import com.easydoordelivery.service.CategoriesService;
import com.easydoordelivery.service.CustomersService;
import com.easydoordelivery.service.EmployeesService;
import com.easydoordelivery.service.OrderDetailsService;
import com.easydoordelivery.service.OrdersService;
import com.easydoordelivery.service.ProductsService;
import com.easydoordelivery.service.ShippersService;
import com.easydoordelivery.service.SuppliersService;
import com.easydoordelivery.service.impl.ProductsServiceImpl;

public class EasyDoorDeliverFacade {
	
	private CategoriesService categoriesService;
	private ProductsService productsServices;
	private SuppliersService suppliersService;
	private CustomersService customersService;
	private EmployeesService employeesService;
	private OrderDetailsService orderDetailsService;
	private OrdersService ordersService;
	private ShippersService shippersService;

	public CategoriesService getCategoriesService() {
		return categoriesService;
	}

	public void setCategoriesService(CategoriesService categoriesService) {
		this.categoriesService = categoriesService;
	}

	public ProductsService getProductsServices() {
		return productsServices;
	}

	public void setProductsServices(ProductsService productsServices) {
		this.productsServices = productsServices;
	}

	public SuppliersService getSuppliersService() {
		return suppliersService;
	}

	public void setSupplierService(SuppliersService suppliersService) {
		this.suppliersService = suppliersService;
	}

	public EasyDoorDeliverFacade() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		categoriesService = (CategoriesService) context.getBean("categoriesService");
		productsServices = (ProductsService) context.getBean("productsService");
		suppliersService = (SuppliersService) context.getBean("suppliersService");
		customersService = (CustomersService) context.getBean("customersService");
		employeesService = (EmployeesService) context.getBean("employeesService");
		orderDetailsService = (OrderDetailsService) context.getBean("orderDetailsService");
		ordersService = (OrdersService) context.getBean("ordersService");
		shippersService = (ShippersService) context.getBean("shippersService");	
	}

	public Session beginSession(){
		return productsServices.beginSession();
	}
	public void endSession(Session session){
		productsServices.endSession(session);
	}
	public void saveCatogories(Categories obj, Session session) {
		categoriesService.save(obj, session);
	}

	public void saveProducts(Products obj, Session session) {
		productsServices.save(obj, session);
	}

	public void saveSuppliers(Suppliers supp, Session session) {
		suppliersService.save(supp, session);
	}

	public void updateProduct(Products prod, Session session) {
		productsServices.updateProduct(prod, session);
	}

	public void updateOrderDetails(OrderDetails ord, Session session){
		orderDetailsService.update(ord, session);
	}
	public void readAllCategories(Categories cat) {
		categoriesService.readAllRecord(cat);
	}

	public void readAllProducts(Products obj) {
		productsServices.readAllRecord(obj);
	}

	public Categories readCategoriesById(int id, Categories cat, Session session) {
		return categoriesService.readById(id, cat, session);
	}

	public Products readProductsById(int id, Products prod, Session session) {
		return productsServices.readById(id, prod, session);
	}
	public OrderDetails readOrderDetailsById(int id, OrderDetails ord, Session session){
		return orderDetailsService.readById(id, ord, session);
	}

	public void readProductFromCategory() {
		categoriesService.readProductFromCategory();
	}
	public void displayProducts(Products prod){
		productsServices.displayProducts(prod);
	}
	public void displayOrderDetails(OrderDetails ord){
		orderDetailsService.displayOrderDetails(ord);
	}
	public void useFilter(){
		categoriesService.useFilter();
	}

	public CustomersService getCustomersService() {
		return customersService;
	}

	public void setCustomersService(CustomersService customersService) {
		this.customersService = customersService;
	}

	public EmployeesService getEmployeesService() {
		return employeesService;
	}

	public void setEmployeesService(EmployeesService employeesService) {
		this.employeesService = employeesService;
	}

	public OrderDetailsService getOrderDetailsService() {
		return orderDetailsService;
	}

	public void setOrderDetailsService(OrderDetailsService orderDetailsService) {
		this.orderDetailsService = orderDetailsService;
	}

	public OrdersService getOrdersService() {
		return ordersService;
	}

	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}

	public ShippersService getShippersService() {
		return shippersService;
	}

	public void setShippersService(ShippersService shippersService) {
		this.shippersService = shippersService;
	}
	public void saveOrderDetails(OrderDetails ord, Session session){
	orderDetailsService.save(ord, session);
}

public void saveCustomers(Customers cust, Session session){
	customersService.save(cust, session);
}

public void saveEmployees(Employees emp, Session session){
	employeesService.save(emp, session);
}

public void saveOrders(Orders ord, Session session){
	ordersService.save(ord, session);
}

public void saveShippers(Shippers ship, Session session){
	shippersService.save(ship, session);
}

/*public Categories readCategoriesById(int id, Object obj) {
	return categoriesService.readById(id, obj);
}
*/
/*
 * public List<Categories> listAllCategories(){ return
 * categoriesService.listAllCategories(); }
 */
}
