package com.easydoordelivery.model;

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
@Table(name =  "Shippers")
public class Shippers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ShipperID")
	private int shipperId;
	@Column(name = "ShipperName")
	private String shipperName;
	@Column(name = "Phone")
	private String phone;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="Shipper_OrderID")
	private Set<Orders> orderList = new HashSet<Orders>();
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
	public String getShipperName() {
		return shipperName;
	}
	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Set<Orders> getOrderList() {
		return orderList;
	}
	public void setOrderList(Set<Orders> orderList) {
		this.orderList = orderList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((orderList == null) ? 0 : orderList.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + shipperId;
		result = prime * result
				+ ((shipperName == null) ? 0 : shipperName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shippers other = (Shippers) obj;
		if (orderList == null) {
			if (other.orderList != null)
				return false;
		} else if (!orderList.equals(other.orderList))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (shipperId != other.shipperId)
			return false;
		if (shipperName == null) {
			if (other.shipperName != null)
				return false;
		} else if (!shipperName.equals(other.shipperName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Shippers [shipperID=" + shipperId + ", shipperName="
				+ shipperName + ", phone=" + phone + ", orderList=" + orderList
				+ "]";
	}
	
	
}
