package com.icici.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.icici.entity.Order;
import com.icici.entity.Payment;

public class PaymentDaoImpl {

	public void savePaymentForOrder(Payment payment, int orderId) {

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
			payment.setOrder(order);
			// save call
			
			order.setPayment(payment);

			entityManager.persist(payment);

			transaction.commit();
			entityManager.close();

			System.out.println("payment saved successfull....");

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