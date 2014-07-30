package com.easydoordelivery.model;

import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name = "orders")
public class Orders {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="OrderID")
	private int orderId;
	@Column(name = "OrderDate")
	private Date orderDate;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

//	private int customerId;
//	private int employeeId;
//	private int shipperId;
	
	/*@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="Order_OrderDetailID")
	private Set<OrderDetails> orderDetailList = new HashSet<OrderDetails>();
*/
	
}
