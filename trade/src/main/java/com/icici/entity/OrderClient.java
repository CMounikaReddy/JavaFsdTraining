package com.icici.entity;

import com.icici.dao.PaymentDaoImpl;

public class OrderClient {

	public static void main(String[] args) {

		// OrderManagementImpl orderManagementImpl = new OrderManagementImpl();

		/*
		 //Create Record 
		 Order order = new Order(); order.setOrderName("Purchase");
		 order.setAmount(204600); order.setStatus("Confirmed");
		 
		 orderManagementImpl.createOrder(order);
		 */

		/*
		 * Retrieve Record int orderId = 3; order = orderManagementImpl.getOrder(3);
		 * 
		 * if(order==null) System.out.println("OrderId not Available");
		 * 
		 * else { System.out.println(order.getOrderId());
		 * System.out.println(order.getOrderName());
		 * System.out.println(order.getAmount()); }
		 */

		/*
		 * Update Record Order order = new Order(); order.setOrderId(2);
		 * order.setOrderName("Festival Purchase"); order.setAmount(2050);
		 * order.setStatus("Delivered"); orderManagementImpl.updateOrder(order);
		 */

		/*
		 * Delete Record
		 * 
		 * orderManagementImpl.deleteOrder(11);
		 */

		/*
		 * Print all Records List<Order> orderList = orderManagementImpl.ListOrders();
		 * 
		 * if(orderList==null) System.out.println("Orders not present"); else { for
		 * (Order order : orderList) { System.out.println(order.getOrderId());
		 * System.out.println(order.getOrderName());
		 * System.out.println(order.getStatus()); System.out.println(order.getAmount());
		 * }
		 * 
		 * System.out.println("Order details retrival successfull...."); }
		 */

		/* 
		 * List<Order> orderList = orderManagementImpl.getOrderByNameLike("New");
		 * 
		 * 
		 * if(orderList==null) System.out.println("Orders not present"); else { for
		 * (Order order : orderList) { System.out.println(order.getOrderId());
		 * System.out.println(order.getOrderName());
		 * System.out.println(order.getStatus()); System.out.println(order.getAmount());
		 * }
		 * 
		 * System.out.println("Order details retrieval successful...."); }
		 */
		
		/*
		 * Order order = new Order(); order.setOrderName("New Year Purchase");
		 * order.setAmount(5300); order.setStatus("Delivered");
		 * 
		 * OrderItem OrderItem1 = new OrderItem(); OrderItem1.setProductId(66);
		 * OrderItem1.setOrder(order);
		 * 
		 * OrderItem OrderItem2 = new OrderItem(); OrderItem2.setProductId(246);
		 * OrderItem2.setOrder(order);
		 * 
		 * OrderItem OrderItem3 = new OrderItem(); OrderItem3.setProductId(336);
		 * OrderItem3.setOrder(order);
		 * 
		 * OrderItem OrderItem4 = new OrderItem(); OrderItem4.setProductId(892);
		 * OrderItem4.setOrder(order);
		 * 
		 * List<OrderItem> itemsList = new ArrayList(); itemsList.add(OrderItem1);
		 * itemsList.add(OrderItem2); itemsList.add(OrderItem3);
		 * itemsList.add(OrderItem4);
		 * 
		 * order.setItems(itemsList);
		 * 
		 * orderManagementImpl.createOrderWithItems(order);
		 */
		
		Payment payment = new Payment();
		payment.setPaymentStatus("Payment Pending");
		
		PaymentDaoImpl paymentDaoImpl = new PaymentDaoImpl();
		paymentDaoImpl.savePaymentForOrder(payment, 873);

	}

}
