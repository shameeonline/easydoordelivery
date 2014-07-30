package com.easydoordelivery.client;


import java.util.List;

import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

import com.easydoordelivery.facade.EasyDoorDeliverFacade;
import com.easydoordelivery.model.Categories;
import com.easydoordelivery.model.Products;

public class CategoriesServiceClient extends EasyDoordeliveryMock{
	
	private EasyDoorDeliverFacade  facade=new EasyDoorDeliverFacade();;
	//@Ignore
	//@Test
    public void testSaveCategory(Session session) {
			facade.saveCatogories(getMockCategories(), session);
	}   
	@Test
    public void testReadCategoriesById(Session session) {
		 Categories categories = facade.readCategoriesById(1, new Categories(), session);
		 if(categories != null){
		 System.out.println("name : " + categories.getCategoryName());
		 }else{
			 System.out.println("null object");
			 System.out.println(categories);

		 }
    }
	//@Test
	
	@Test
	public void testreadAllCategories(){
		Categories cat = new Categories();
		facade.readAllCategories(cat);
	}
	@Test
	public void testreadProductFromCategory(){
		facade.readProductFromCategory();
	}
	@Test
	public void testuseFilter(){
		facade.useFilter();
	}
	//public static void main(String[] args) {
		
		
		
		//products.setCategories(categories);
		//new CategoriesServiceClient().callSaveCatogories(getMockCategories());
		//new CategoriesServiceClient().useFilter();
		//categories = new CategoriesServiceClient().callReadCategoriesById(1, new Categories());
		//System.out.println("now categories "+categories);
	//	Products products = new CategoriesServiceClient().callReadProductsById(1, getMockProduct());
		//System.out.println("Read all product info");
	//	new CategoriesServiceClient().readAllProducts();
		
		//Save Product
		//new CategoriesServiceClient().callSaveProducts(getMockProduct());
	//	System.out.println();
	//	System.out.println("Update product with category id ");
		
		//Categories categories = new CategoriesServiceClient().callReadCategoriesById(1, getMockCategories());
		//categories.setCategoryName("UpdatedcategoryName");
		//List<Products> prodList = (Products)categories.getProducts();
		/*for(Products prodList: categories.getProducts()){
			prodList.setProductName("UpdatedproductName1");
			new CategoriesServiceClient().callUpdateProducts(prodList);
			categories.addProducts(prodList);
		}*/
	//	new CategoriesServiceClient().callUpdateCategories(1,"Updated CategoryName");
		//new CategoriesServiceClient().callUpdateProduct(1,"Updated ProductdddddddddName");

		//System.out.println("saved");
	//	new CategoriesServiceClient().readAllCategories();

		//categories.setCategoryName("poultry");
		//new CategoriesServiceClient().callUpdateCategories(categories);*/
		
		//System.out.println();
	//	System.out.println("Get Category info" +categories.toString());
		//System.out.println("-----------------");
		//new CategoriesServiceClient().readProductFromCategory();
		//System.out.println("THE END");
		
	//}
}
