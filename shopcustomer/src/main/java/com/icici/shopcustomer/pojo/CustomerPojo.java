package com.icici.shopcustomer.pojo;

import com.icici.shoporder.pojo.OrderPojo;

public class CustomerPojo {
	
	private String cusName;
	private int cusId;
	private OrderPojo orderPojo;

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public OrderPojo getOrderPojo() {
		return orderPojo;
	}

	public void setOrderPojo(OrderPojo orderPojo) {
		this.orderPojo = orderPojo;
	}
	
	

}
