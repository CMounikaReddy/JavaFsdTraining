package com.icici.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.icici.entity.Customer;
import com.icici.entity.Product;

public class CustomerDaoImpl {
	
	public void saveCustomer(Customer customer) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			entityManager.persist(customer);

			transaction.commit();
			entityManager.close();

			System.out.println("Customer saved successfully!!!");

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
	
	public void custToProd(int cusId,int productId) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();
			
			Customer customerobj = entityManager.find(Customer.class, cusId);
			Product product = entityManager.find(Product.class, productId);

			Set<Product> prodlist = customerobj.getProducts();
			prodlist.add(product);
			
			customerobj.setProducts(prodlist);

			transaction.commit();
			entityManager.close();

			System.out.println("Details saved successfully!!!");

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
	
	void getCustomerList() {
		
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();
			
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();

			CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
			Root<Customer> customer = cq.from(Customer.class);
			cq.select(customer);
			
			TypedQuery<Customer> q = entityManager.createQuery(cq);
			List<Customer> cuslist = q.getResultList();
			
			for(Customer c:cuslist) {
				System.out.println(c.getCustomername());
				System.out.println(c.getAge());
			}
			
			transaction.commit();
			entityManager.close();

			System.out.println("Customer Details saved!!!");

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
