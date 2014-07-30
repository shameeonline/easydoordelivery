package com.easydoordelivery.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetails {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="OrderDetailID")
	private int orderDetailId;
	@Column(name = "Quantity")
	private int quantity;
	
	//private int orderID;
	//private int productID;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OrderDetails_Order")
	private Orders order;

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	}
