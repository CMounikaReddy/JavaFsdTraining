package com.icici.dao;

import com.icici.entity.OrderItem;

public class OrderItemClient {

	public static void main(String[] args) {
		
		OrderItem orderItem = new OrderItem();
		orderItem.setProductId(101);
		
		
		OrderItemDAOImpl orderItemDaoImpl= new OrderItemDAOImpl();
		//orderItemDaoImpl.saveOrderItem(orderItem, 11);
		
		orderItemDaoImpl.getOrderWithOrderItemDetail(6);
	}
		
		
}


