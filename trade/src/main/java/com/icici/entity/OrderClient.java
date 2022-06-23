package com.icici.entity;

import java.util.List;

public class OrderClient {

	public static void main(String[] args) {
		
		OrderManagementImpl orderManagementImpl = new OrderManagementImpl();
		
		/* Create Record
		 * Order order = new Order(); order.setOrderName("New Purchase");
		 * order.setAmount(2000); order.setStatus("Confirmed");
		 * 
		 * orderManagementImpl.createOrder(order);
		 */
		
		/* Retrieve Record
		 * int orderId = 3; order = orderManagementImpl.getOrder(3);
		 * 
		 * if(order==null) System.out.println("OrderId not Available");
		 * 
		 * else { System.out.println(order.getOrderId());
		 * System.out.println(order.getOrderName());
		 * System.out.println(order.getAmount()); }
		 */
		
		/* Update Record 
		 * Order order = new Order(); order.setOrderId(2);
		 * order.setOrderName("Festival Purchase"); order.setAmount(2050);
		 * order.setStatus("Delivered"); 
		 * orderManagementImpl.updateOrder(order);
		 */
		 
		/*  Delete Record
		 
		 * orderManagementImpl.deleteOrder(11);
		 */
		
		/* Print all Records
		 * List<Order> orderList = orderManagementImpl.ListOrders();
		 * 
		 * if(orderList==null) System.out.println("Orders not present"); else { for
		 * (Order order : orderList) { System.out.println(order.getOrderId());
		 * System.out.println(order.getOrderName());
		 * System.out.println(order.getStatus()); System.out.println(order.getAmount());
		 * }
		 * 
		 * System.out.println("Order details retrival successfull...."); }
		 */
		
        List<Order> orderList = orderManagementImpl.getOrderByNameLike("New");
		
		if(orderList==null)
			System.out.println("Orders not present");
		else {
			for (Order order : orderList) {
				System.out.println(order.getOrderId());
				System.out.println(order.getOrderName());
				System.out.println(order.getStatus());
				System.out.println(order.getAmount());
			}
			
			System.out.println("Order details retrieval successfull....");
		}
		
	}

}
