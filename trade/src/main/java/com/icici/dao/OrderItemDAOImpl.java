package com.icici.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.icici.entity.Order;
import com.icici.entity.OrderItem;

public class OrderItemDAOImpl {
	
	void saveOrderItem(OrderItem orderItem,int orderId ){
		

				EntityManagerFactory emf = null;
				EntityManager entityManager = null;
				EntityTransaction transaction = null;
				try {
					emf = Persistence.createEntityManagerFactory("corebanking");
					entityManager = emf.createEntityManager();

					transaction = entityManager.getTransaction();

					// start transaction
					transaction.begin();

					Order order = entityManager.getReference(Order.class, orderId);

					// entity association
					orderItem.setOrder(order);
					// save call

					entityManager.persist(orderItem);

					transaction.commit();
					entityManager.close();

					System.out.println("Order saved   successfull....");

				} catch (Exception e) {
					System.out.println(e);
					transaction.rollback();
				} finally {

					if (entityManager != null) {
						entityManager.close();
					}
					if (emf != null) {
						emf.close();
					}
				}

			}
	
	void getOrderWithOrderItemDetail(int orderId ){
		

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			Order order = entityManager.find(Order.class, orderId);

			System.out.println(order.getOrderName());
			System.out.println(order.getOrderId());
			System.out.println(order.getAmount());
			System.out.println(order.getStatus());
			
			List<OrderItem> itemsList = order.getItems();
			
			for(OrderItem orderItem:itemsList) {
				System.out.println("\n Order Item");
				System.out.println(orderItem.getOrderitemId());
				System.out.println(orderItem.getProductId());
				
			}

			transaction.commit();
			entityManager.close();

			System.out.println("Order saved successfull....");

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {

			if (entityManager != null) {
				entityManager.close();
			}
			if (emf != null) {
				emf.close();
			}
		}

	}
	
	
	
	

}