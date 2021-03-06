package com.orderset.assignment2;

import java.util.TimeZone;

public class OrderPojo {
	
	private String name;
	private double amount;
	private String status;
	private int orderId;
	TimeZone zone;
	
	
	public OrderPojo(String Name,double Amount,String Status,int OrderId)
	{
		this.name=Name;
		this.amount=Amount;
		this.status=Status;
		this.orderId=OrderId;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public TimeZone getZone() {
		return zone;
	}
	public void setZone(TimeZone zone) {
		this.zone = zone;
	}

}
