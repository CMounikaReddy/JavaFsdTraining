package com.icici.dao;

import java.util.List;

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

public class ProductDaoImpl {
	
	public void saveProduct(Product product) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			entityManager.persist(product);

			transaction.commit();
			entityManager.close();

			System.out.println("Product saved successfully!!!");

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
	
void getProductList() {
		
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

			CriteriaQuery<Product> cq = cb.createQuery(Product.class);
			Root<Product> product = cq.from(Product.class);
			cq.select(product);
			
			TypedQuery<Product> q = entityManager.createQuery(cq);
			List<Product> prodlist = q.getResultList();
			
			for(Product c:prodlist) {
				System.out.print(c.getProdName() + " - ");
				System.out.println(c.getPrice());
			}
			
			transaction.commit();
			entityManager.close();

			System.out.println("Product Details Retrieved!!!");

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
