package com.easydoordelivery.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Categories implements Serializable {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CategoryID")
	private int categoryId;
	@Column(name = "CategoryName")
	private String categoryName;
	@Column(name = "Description")
	private String description;	
    /*@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	//@JoinColumn(name="Category_ProductID")
    private Set<Products> products=new HashSet<Products>();
*/
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
