package com.easydoordelivery.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "suppliers")
public class Suppliers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="SupplierID")
	private int supplierId;
	@Column(name = "SupplierName")
	private String supplierName;
	@Column(name = "ContactName")
	private String contactName;
	@Column(name = "Phone")
	private String phone;
	/*@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="PROD_SUPPLIER_ID")
    private Set<Products> products=new HashSet<Products>();*/
	@Embedded
	private SupplierAddress supplierAddress;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public SupplierAddress getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(SupplierAddress supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	
	
		
}
